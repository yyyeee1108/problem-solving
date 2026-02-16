package misc;

import java.io.*;

public class QuickSortTest {

    static int n = 8;
    static int[] arr = {6, -8, 1, 12, 8, 3, 7, -7};

    static void quickSort(int st, int en){
        if(en <= st+1) return;
        int pivot = arr[st];
        int l = st+1;
        int r = en-1;
        int t;

        while(true){
            while(l <= r && arr[l] <= pivot) l++;
            while(l <= r && arr[r] > pivot) r--;
            if(l>r) break;
            t = arr[r];
            arr[r] = arr[l];
            arr[l] = t;
        }
        t = arr[r];
        arr[r] = arr[st];
        arr[st] = t;

        quickSort(st, r);
        quickSort(r+1, en);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        quickSort(0,n);
        for(int i=0;i<n;i++) sb.append(arr[i]).append(' ');
        bw.write(sb.toString().trim());
        bw.flush();
    }
}
