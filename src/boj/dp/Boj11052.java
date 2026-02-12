package boj.dp;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 이름: 카드 구매하기
 * 문제 링크: https://www.acmicpc.net/problem/11052
 * 풀이 날짜: 2026-02-12
 */
public class Boj11052 {

    static int[] D = new int[1001];
    static int[] P = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        D[0] = 0;
        for (int i = 1; i <= N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= i; j++) {
                D[i] = Math.max(D[i], D[i - j] + P[j]);
            }
        }

        bw.write(String.valueOf(D[N]));
        bw.flush();

        bw.close();
        br.close();
    }
}
