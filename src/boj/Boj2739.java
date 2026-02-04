package boj;

import java.io.*;

/**
 * 문제 이름: 구구단
 * 문제 링크: https://www.acmicpc.net/problem/2739
 * 풀이 날짜: 2026-02-04
 */
public class Boj2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 9; i++) {
            sb.append(n).append(" * ")
                    .append(i).append(" = ")
                    .append(n * i).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
