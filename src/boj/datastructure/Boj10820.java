package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 문자열 분석
 * 문제 링크: https://www.acmicpc.net/problem/10820
 * 풀이 날짜: 2026-03-03
 */
public class Boj10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String input;
        int[] cnts = new int[4]; // 0:low, 1:upp, 2:num, 3:blk

        while ((input = br.readLine()) != null) {
            char[] arr = input.toCharArray();
            Arrays.fill(cnts, 0);
            for (char c : arr) {
                if ('a' <= c && c <= 'z') cnts[0]++;
                else if ('A' <= c && c <= 'Z') cnts[1]++;
                else if ('0' <= c && c <= '9') cnts[2]++;
                else if (c == ' ') cnts[3]++;
            }
            for (int cnt : cnts) sb.append(cnt).append(' ');
            sb.append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
