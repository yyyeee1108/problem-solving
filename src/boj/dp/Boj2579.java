package boj.dp;

import java.io.*;

/**
 * 문제 이름: 계단 오르기
 * 문제 링크: https://www.acmicpc.net/problem/2579
 * 풀이 날짜: 2026-02-05
 */
public class Boj2579 {

    static int[] S = new int[301];
    static int[][] D = new int[301][3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            S[i] = Integer.parseInt(br.readLine());
        }
        if (N == 1) {
            bw.write(String.valueOf(S[1]));
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        D[1][1] = S[1];
        D[1][2] = 0;
        D[2][1] = S[2];
        D[2][2] = S[1] + S[2];

        for (int i = 3; i <= N; i++) {
            D[i][1] = Math.max(D[i - 2][1], D[i - 2][2]) + S[i];
            D[i][2] = D[i - 1][1] + S[i];
        }

        bw.write(String.valueOf(Math.max(D[N][1], D[N][2])));
        bw.flush();
        bw.close();
        br.close();
    }
}
