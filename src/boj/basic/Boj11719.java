package boj.basic;

import java.io.*;

/**
 * 문제 이름: 그대로 출력하기 2
 * 문제 링크: https://www.acmicpc.net/problem/11719
 * 풀이 날짜: 2026-02-04
 */
public class Boj11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String line;
        while((line = br.readLine()) != null){
            sb.append(line).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
