package boj.basic;

import java.io.*;

/**
 * 문제 이름: A+B - 2
 * 문제 링크: https://www.acmicpc.net/problem/2558
 * 풀이 날짜: 2026-02-04
 */
public class Boj2558 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for(int i = 0 ; i < 2 ; i++){
            sum += Integer.parseInt(br.readLine());
        }

        sb.append(sum);
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
