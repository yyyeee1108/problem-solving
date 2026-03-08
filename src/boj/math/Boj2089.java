package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: -2진수
 * 문제 링크: https://www.acmicpc.net/problem/2089
 * 풀이 날짜: 2026-03-08
 */
public class Boj2089 {

    static String solve(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 0) {
            sb.append(0);
        } else {
            while (n != 1) {
                sb.append(Math.abs(n % -2));

                n = (int) (Math.ceil((double) n / -2));
            }
            sb.append(n);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(solve(N));
        bw.flush();
    }
}