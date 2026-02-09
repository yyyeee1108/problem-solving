package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 가장 긴 증가하는 부분 수열
 * 문제 링크: https://www.acmicpc.net/problem/11053
 * 풀이 날짜: 2026-02-07
 */
public class Boj11053 {

    static int[] D = new int[1001];
    static int[] S = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        D[1] = 1;
        for (int i = 1; i <= N; i++) {
            S[i] = Integer.parseInt(st.nextToken());

            D[i] = 1;
            for (int j = 1; j <= i; j++) {
                if (S[j] < S[i] && D[j] >= D[i]) {
                    D[i] = D[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i : D) {
            max = Math.max(max, i);
        }

        bw.write(String.valueOf(max));
        bw.flush();

        bw.close();
        br.close();
    }
}
