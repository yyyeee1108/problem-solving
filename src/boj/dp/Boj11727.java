package boj.dp;

import java.io.*;

/**
 * 문제 이름: 2×n 타일링 2
 * 문제 링크: https://www.acmicpc.net/problem/11727
 * 풀이 날짜: 2026-02-07
 */
public class Boj11727 {

    static int[] D = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        D[1] = 1;
        D[2] = 3;
        for (int i = 3; i <= N; i++) {
            D[i] = (2 * D[i - 2] + D[i - 1]) % 10007;
        }

        bw.write(String.valueOf(D[N]));
        bw.flush();

        bw.close();
        br.close();
    }
}
