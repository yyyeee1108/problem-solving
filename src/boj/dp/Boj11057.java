package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 오르막 수
 * 문제 링크: https://www.acmicpc.net/problem/11057
 * 풀이 날짜: 2026-02-07
 */
public class Boj11057 {

    static long[][] D = new long[1001][10];
    static long MOD = 10007L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Arrays.fill(D[1], 1);
        for (int i = 2; i <= N; i++) {
            D[i][0] = D[i - 1][0];
            for (int j = 1; j < 10; j++) {
                D[i][j] = (D[i][j - 1] + D[i - 1][j]) % MOD;
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
