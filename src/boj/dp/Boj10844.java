package boj.dp;

import java.io.*;

/**
 * 문제 이름: 쉬운 계단 수
 * 문제 링크: https://www.acmicpc.net/problem/10844
 * 풀이 날짜: 2026-02-07
 */
public class Boj10844 {

    static long[][] D = new long[101][10];
    static long MOD = 1000000000L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        D[1][0] = 0;
        for (int i = 1; i <= 9; i++) {
            D[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            // 끝이 0인 경우
            D[i][0] = D[i - 1][1] % MOD;
            // 끝이 9인 경우
            D[i][9] = D[i - 1][8] % MOD;
            // 끝이 1-8인 경우
            for (int j = 1; j <= 8; j++) {
                D[i][j] = (D[i - 1][j - 1] + D[i - 1][j + 1]) % MOD;
            }
        }

        long sum = 0;
        for (long d : D[N]) {
            sum = (sum + d) % MOD;
        }

        bw.write(String.valueOf(sum));
        bw.flush();

        bw.close();
        br.close();
    }
}
