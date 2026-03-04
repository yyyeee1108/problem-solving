package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 최대공약수
 * 문제 링크: https://www.acmicpc.net/problem/1850
 * 풀이 날짜: 2026-03-04
 */
public class Boj1850 {
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

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong((st.nextToken()));
        long B = Long.parseLong((st.nextToken()));

        long r = gcd(A, B);

        while (r-- > 0) bw.write('1');
        bw.flush();
    }
}