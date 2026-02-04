package boj.basic;

import java.io.*;

/**
 * 문제 이름: 열 개씩 끊어 출력하기
 * 문제 링크: https://www.acmicpc.net/problem/11721
 * 풀이 날짜: 2026-02-04
 */
public class Boj11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        int i= 0;
        for(char c: line.toCharArray()){
            sb.append(c);
            if(++i == 10){
                sb.append('\n');
                i = 0;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
