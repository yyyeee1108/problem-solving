package misc;

import java.io.*;

public class MergeSortTest {

    static int n = 10;
    static int[] arr = {15, 25, 22, 357, 16, 23, -53, 12, 46, 3};
    static int[] tmp = new int[1000001]; // merge 함수에서 리스트 2개를 합친 결과를 임시로 저장하고 있을 변수

    // mid = (st+en)/2라고 할 때 arr[st:mid], arr[mid:en]은 이미 정렬이 되어있는 상태일 때 arr[st:mid]와 arr[mid:en]을 합친다.
    static void merge(int st, int en) {
        int mid = (st + en) / 2;
        int stCur = st;
        int enCur = mid;
        for (int i = st; i < en; i++) {
            if (stCur == mid) tmp[i] = arr[enCur++];
            else if (enCur == en) tmp[i] = arr[stCur++];
            else if (arr[stCur] <= arr[enCur]) tmp[i] = arr[stCur++];
            else tmp[i] = arr[enCur++];
        }
        for (int i = st; i < en; i++) arr[i] = tmp[i];
    }

    // arr[st:en]을 정렬하고 싶다.
    static void mergeSort(int st, int en) {
        if (en - st == 1) return; // 길이 1인 경우
        int mid = (st + en) / 2;
        mergeSort(st, mid); // arr[st:mid]을 정렬한다.
        mergeSort(mid, en); // arr[mid:en]을 정렬한다.
        merge(st, en); // arr[st:mid]와 arr[mid:en]을 합친다.
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        mergeSort(0, n);

        for (int i = 0; i < n; i++) sb.append(arr[i]).append(' ');
        bw.write(sb.toString().trim()); // -53 3 12 15 16 22 23 25 46 357
        bw.flush();
    }
}
