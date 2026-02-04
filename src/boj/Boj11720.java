package boj;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 숫자의 합
 * 문제 링크: https://www.acmicpc.net/problem/11720
 * 풀이 날짜: 2026-02-04
 */
public class Boj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        String line = br.readLine();

        int sum = 0;
        for(char c : line.toCharArray()){
            sum += c - '0';
        }
        sb.append(sum);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
