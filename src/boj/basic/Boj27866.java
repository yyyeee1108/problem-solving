package boj.basic;

import java.io.*;

/**
 * 문제 이름: 문자와 문자열
 * 문제 링크: https://www.acmicpc.net/problem/27866
 * 풀이 날짜: 2026-02-08
 */
public class Boj27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] S = br.readLine().toCharArray();
        int i = Integer.parseInt(br.readLine());
        bw.write(S[i - 1]);
        bw.flush();

        bw.close();
        br.close();
    }
}
