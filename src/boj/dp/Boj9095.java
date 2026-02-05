package boj.dp;

import java.io.*;

/**
 * 문제 이름: 1, 2, 3 더하기
 * 문제 링크: https://www.acmicpc.net/problem/9095
 * 풀이 날짜: 2026-02-05
 */
public class Boj9095 {

    static int[] D = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        D[1] = 1;
        D[2] = 2;
        D[3] = 4;
        for (int i = 4; i <= 10; i++) {
            D[i] = D[i - 1] + D[i - 2] + D[i - 3];
        }

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(D[N]).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
