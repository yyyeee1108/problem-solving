package boj.sort;

import java.io.*;

/**
 * 문제 이름: 수 정렬하기 2
 * 문제 링크: https://www.acmicpc.net/problem/2751
 * 풀이 날짜: 2026-02-14
 */
public class Boj2751 {

    static int[] arr = new int[1000001];
    static int[] tmp = new int[1000001];

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

    static void mergeSort(int st, int en) {
        if (en - st == 1) return;
        int mid = (st + en) / 2;
        mergeSort(st, mid);
        mergeSort(mid, en);
        merge(st, en);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, N);

        for (int i = 0; i < N; i++) sb.append(arr[i]).append('\n');
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
