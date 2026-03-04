package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 최소공배수
 * 문제 링크: https://www.acmicpc.net/problem/1934
 * 풀이 날짜: 2026-03-04
 */
public class Boj1934 {
    static long gcd(long a, long b) {
        while (b > 0) { // 나머지가 0이 될 때까지 반복
            long tmp = a % b; // 나머지를 미리 구하고
            a = b;           // 큰 숫자를 작은 숫자로 교체
            b = tmp;         // 작은 숫자를 나머지로 교체
        }
        return a; // b가 0이 됐을 때의 a가 바로 GCD
    }

    static long solve(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        long A;
        long B;
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            A = Long.parseLong(st.nextToken());
            B = Long.parseLong(st.nextToken());

            sb.append(solve(A, B)).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
    }
}