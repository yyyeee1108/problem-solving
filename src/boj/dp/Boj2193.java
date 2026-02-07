package boj.dp;

import java.io.*;

/**
 * 문제 이름: 이친수
 * 문제 링크: https://www.acmicpc.net/problem/2193
 * 풀이 날짜: 2026-02-07
 */
public class Boj2193 {

    static long[][] D = new long[91][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        D[1][0] = 0;
        D[1][1] = 1;
        for (int i = 2; i <= N; i++) {
            D[i][0] = D[i - 1][0] + D[i - 1][1];
            D[i][1] = D[i - 1][0];
        }

        bw.write(String.valueOf(D[N][0] + D[N][1]));
        bw.flush();

        bw.close();
        br.close();
    }
}
