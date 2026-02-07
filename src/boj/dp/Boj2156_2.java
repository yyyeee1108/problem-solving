package boj.dp;

import java.io.*;

/**
 * 문제 이름: 포도주 시식 - 1차원 배열 풀이
 * 문제 링크: https://www.acmicpc.net/problem/21562
 * 풀이 날짜: 2026-02-07
 */
public class Boj2156_2 {
    static int[] D = new int[10001];
    static int[] S = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            S[i] = Integer.parseInt(br.readLine());
        }

        D[0] = 0;
        for (int i = 1; i <= N; i++) {
            if (i == 1) D[i] = S[i];
            else if (i == 2) D[i] = S[i - 1] + S[i];
            else D[i] = Math.max(D[i - 1], Math.max(D[i - 2] + S[i], D[i - 3] + S[i] + S[i - 1]));
        }

        bw.write(String.valueOf(D[N]));
        bw.flush();

        bw.close();
        br.close();
    }
}
