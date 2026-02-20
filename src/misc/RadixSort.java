package misc;

import java.io.*;
import java.util.*;

public class RadixSort {

    static int n = 15;
    static int[] arr = new int[1000001];
    static int d = 3;
    static int[] p10 = new int[3];

    static int digitNum(int x, int a) {
        return (x / p10[a]) % 10;
    }

    static ArrayList<Integer>[] l = new ArrayList[10];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            l[i] = new ArrayList<>();
        }

        p10[0] = 1;
        for (int i = 1; i < d; i++) p10[i] = p10[i - 1] * 10;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < 10; j++) l[j].clear();
            for (int j = 0; j < n; j++)
                l[digitNum(arr[j], i)].add(arr[j]);
            int aidx = 0;
            for (int j = 0; j < 10; j++) {
                for (var x : l[j]) arr[aidx++] = x;
            }
        }
        for (int i = 0; i < n; i++) sb.append(arr[i]).append(' ');
        bw.write(sb.toString().trim());
        bw.flush();
    }
}
