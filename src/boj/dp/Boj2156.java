package boj.dp;

import java.io.*;

/**
 * 문제 이름: 포도주 시식
 * 문제 링크: https://www.acmicpc.net/problem/2156
 * 풀이 날짜: 2026-02-07
 */
public class Boj2156 {

    static int[][] D = new int[10001][2];
    static int[] S = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            bw.write(br.readLine());
            bw.flush();
            bw.close();
            br.close();
            return;
        } else if (N == 2) {
            int res = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
            bw.write(String.valueOf(res));
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        D[1][0] = 0;
        D[2][0] = D[1][1] = S[1] = Integer.parseInt(br.readLine());
        S[2] = Integer.parseInt(br.readLine());
        D[2][1] = S[1] + S[2];
        for (int i = 3; i <= N; i++) {
            S[i] = Integer.parseInt(br.readLine());
            D[i][0] = Math.max(D[i - 1][0], D[i - 1][1]);
            D[i][1] = Math.max(D[i - 2][0] + S[i - 1] + S[i], D[i - 1][0] + S[i]);
        }

        bw.write(String.valueOf(Math.max(D[N][0], D[N][1])));
        bw.flush();

        bw.close();
        br.close();
    }
}