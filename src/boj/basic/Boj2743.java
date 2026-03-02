package boj.basic;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 단어 길이 재기
 * 문제 링크: https://www.acmicpc.net/problem/2743
 * 풀이 날짜: 2026-03-03
 */
public class Boj2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        bw.write(String.valueOf(s.length()));
        bw.flush();
    }
}
