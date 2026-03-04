package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 최대공약수와 최소공배수
 * 문제 링크: https://www.acmicpc.net/problem/2609
 * 풀이 날짜: 2026-03-03
 */
public class Boj2609 {

    static long gcd(long a, long b) {
        while (b > 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long gcd = gcd(a, b);
        sb.append(gcd).append('\n');
        sb.append(a * b / gcd);
        bw.write(sb.toString());
        bw.flush();
    }
}
