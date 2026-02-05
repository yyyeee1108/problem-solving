package boj.dp;

import java.io.*;

/**
 * 문제 이름: 1로 만들기
 * 문제 링크: https://www.acmicpc.net/problem/1463
 * 풀이 날짜: 2026-02-05
 */
public class Boj1463 {

    static int N;
    static int[] D = new int[1000005];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        D[1] = 0;
        for (int i = 2; i <= N; i++) {
            D[i] = D[i - 1] + 1;
            if (i % 3 == 0) D[i] = Math.min(D[i], D[i / 3] + 1);
            if (i % 2 == 0) D[i] = Math.min(D[i], D[i / 2] + 1);
        }
        bw.write(String.valueOf(D[N]));
        bw.flush();
        bw.close();
        br.close();
    }
}
