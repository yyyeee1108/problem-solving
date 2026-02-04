package boj;

import java.io.*;

/**
 * 문제 이름: 별 찍기 - 3
 * 문제 링크: https://www.acmicpc.net/problem/2440
 * 풀이 날짜: 2026-02-04
 */
public class Boj2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while (N > 0) {
            sb.append("*".repeat(N--)).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
