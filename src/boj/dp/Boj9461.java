package boj.dp;

import java.io.*;

/**
 * 문제 이름: 파도반 수열
 * 문제 링크: https://www.acmicpc.net/problem/9461
 * 풀이 날짜: 2026-02-10
 */
public class Boj9461 {

    static long[] P = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        P[1] = P[2] = P[3] = 1;

        for (int i = 4; i <= 100; i++) {
            P[i] = P[i - 2] + P[i - 3];
        }

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(P[N]).append('\n');
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
