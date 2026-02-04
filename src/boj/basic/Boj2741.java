package boj.basic;

import java.io.*;

/**
 * 문제 이름: N 찍기
 * 문제 링크: https://www.acmicpc.net/problem/2741
 * 풀이 날짜: 2026-02-04
 */
public class Boj2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int i = 1;
        while(i <= N){
            sb.append(i++).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
