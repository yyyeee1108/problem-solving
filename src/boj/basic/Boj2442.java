package boj.basic;

import java.io.*;

/**
 * 문제 이름: 별 찍기 - 5
 * 문제 링크: https://www.acmicpc.net/problem/2442
 * 풀이 날짜: 2026-02-04
 */
public class Boj2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N ; i++){
            sb.append(" ".repeat(N-i))
                    .append("*".repeat(2*i-1)).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
