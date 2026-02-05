package boj.dp;

import java.io.*;

/**
 * 문제 이름: 계단 오르기 - 1차원 배열 풀이
 * 문제 링크: https://www.acmicpc.net/problem/2579
 * 풀이 날짜: 2026-02-05
 */
public class Boj2579_2 {
    static int[] S = new int[301];
    static int[] D = new int[301];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            S[i] = Integer.parseInt(br.readLine());
            sum += S[i];
        }
        if (N == 1) {
            bw.write(String.valueOf(S[1]));
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        D[1] = S[1];
        D[2] = S[2];
        D[3] = S[3];

        for(int i=4; i < N ; i++){
            D[i] = Math.min(D[i-2], D[i-3]) + S[i];
        }
        bw.write(String.valueOf(sum - Math.min(D[N-1],D[N-2])));
        bw.flush();
        bw.close();
        br.close();
    }
}
