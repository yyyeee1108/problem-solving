package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 스티커
 * 문제 링크: https://www.acmicpc.net/problem/9465
 * 풀이 날짜: 2026-02-07
 */
public class Boj9465 {

    static long[][] D = new long[2][1000001];
    static int[][] S = new int[2][1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= N; j++) {
                    S[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            D[0][1] = S[0][1];
            D[1][1] = S[1][1];

            if (N >= 2) {
                D[0][2] = S[1][1] + S[0][2];
                D[1][2] = S[0][1] + S[1][2];
                for (int i = 3; i <= N; i++) {
                    D[0][i] = Math.max(D[1][i - 1] + S[0][i], D[1][i - 2] + S[0][i]);
                    D[1][i] = Math.max(D[0][i - 1] + S[1][i], D[0][i - 2] + S[1][i]);
                }
            }
            sb.append(Math.max(D[0][N], D[1][N])).append('\n');
        }

        bw.write(sb.toString().trim());
        bw.flush();

        bw.close();
        br.close();
    }
}
