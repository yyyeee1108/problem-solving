package boj.basic;

import java.io.*;

/**
 * 문제 이름: A + B - C
 * 문제 링크: https://www.acmicpc.net/problem/31403
 * 풀이 날짜: 2026-02-08
 */
public class Boj31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        sb.append(A + B - C).append('\n')
                .append(Integer.parseInt(String.valueOf(A) + String.valueOf(B)) - C);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
