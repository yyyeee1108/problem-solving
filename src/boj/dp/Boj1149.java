package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: RGB거리
 * 문제 링크: https://www.acmicpc.net/problem/1149
 * 풀이 날짜: 2026-02-06
 */
public class Boj1149 {

    static int[][] C = new int[1001][3];
    static int[][] D = new int[1001][3];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= 2; j++) {
                C[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        D[1][0] = C[1][0];
        D[1][1] = C[1][1];
        D[1][2] = C[1][2];

        for (int i = 2; i <= N; i++) {
            D[i][0] = Math.min(D[i - 1][1], D[i - 1][2]) + C[i][0];
            D[i][1] = Math.min(D[i - 1][0], D[i - 1][2]) + C[i][1];
            D[i][2] = Math.min(D[i - 1][0], D[i - 1][1]) + C[i][2];
        }

        int resMin = Math.min(Math.min(D[N][0], D[N][1]), D[N][2]);

        bw.write(String.valueOf(resMin));
        bw.flush();
        bw.close();
        br.close();
    }
}
