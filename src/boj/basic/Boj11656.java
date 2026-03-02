package boj.basic;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 접미사 배열
 * 문제 링크: https://www.acmicpc.net/problem/11656
 * 풀이 날짜: 2026-03-03
 */
public class Boj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        String[] suffixs = new String[S.length()];
        for (int i = 0; i < S.length(); i++) {
            suffixs[i] = S.substring(i);
        }
        Arrays.sort(suffixs);

        for (String suffix : suffixs) sb.append(suffix).append('\n');
        bw.write(sb.toString());
        bw.flush();
    }
}
