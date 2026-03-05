package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 진법 변환 2
 * 문제 링크: https://www.acmicpc.net/problem/11005
 * 풀이 날짜: 2026-03-04
 */
public class Boj11005 {

    static char[] map = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static StringBuilder sb = new StringBuilder();

    static void solve(int n, int b) {
        if (n == 0) return;
        solve(n / b, b);
        sb.append(map[n % b]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (N == 0) {
            bw.write("0");
        } else {
            solve(N, B);
            bw.write(sb.toString());
        }
        bw.flush();
    }
}