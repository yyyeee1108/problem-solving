package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 진법 변환
 * 문제 링크: https://www.acmicpc.net/problem/2745
 * 풀이 날짜: 2026-03-05
 */
public class Boj2745 {

    static int charToInt(char c) {
        if ('0' <= c && c <= '9') return c - '0';
        else return c - 'A' + 10;
    }

    static int solve(String n, int b) {
        int res = 0;
        for (int i = 0; i < n.length(); i++) {
            res = res * b + charToInt(n.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(solve(N, B)));
        bw.flush();
    }
}