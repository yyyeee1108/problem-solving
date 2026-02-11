package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 합분해
 * 문제 링크: https://www.acmicpc.net/problem/2225
 * 풀이 날짜: 2026-02-10
 */
public class Boj2225 {

    static long[][] D = new long[201][201];
    static long MOD = 1000000000L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (i == 0) {
                    D[i][j] = 1;
                } else if (j == 0) {
                    D[i][j] = 0;
                } else if (j == 1) {
                    D[i][j] = 1;
                } else {
                    for (int l = 0; l <= i; l++) {
                        D[i][j] = (D[i][j] + D[l][j - 1]) % MOD;
                    }
                }
            }
        }

        bw.write(String.valueOf(D[N][K]));
        bw.flush();

        bw.close();
        br.close();
    }
}
