package boj;

import java.io.*;

/**
 * 문제 이름: 별 찍기 - 9
 * 문제 링크: https://www.acmicpc.net/problem/2446
 * 풀이 날짜: 2026-02-04
 */
public class Boj2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            sb.append(" ".repeat(i))
                    .append("*".repeat(2 * (N - i) - 1)).append('\n');
        }
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i))
                    .append("*".repeat(2 * i - 1)).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
