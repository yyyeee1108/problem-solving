package boj.dp;

import java.io.*;

/**
 * 문제 이름: 제곱수의 합
 * 문제 링크: https://www.acmicpc.net/problem/1699
 * 풀이 날짜: 2026-02-10
 */

public class Boj1699 {

    static int[] D = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            D[i] = i;

            for (int j = 1; j * j <= i; j++) {
                if (D[i] > D[i - j * j] + 1) D[i] = D[i - j * j] + 1;
            }
        }

        bw.write(String.valueOf(D[N]));
        bw.flush();

        bw.close();
        br.close();
    }
}
