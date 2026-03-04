package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: GCD 합
 * 문제 링크: https://www.acmicpc.net/problem/9613
 * 풀이 날짜: 2026-03-04
 */
public class Boj9613 {

    static int[] s = new int[105];

    static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int n;
        long res;
        while (t-- > 0) {
            res = 0;
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) s[i] = Integer.parseInt(st.nextToken());
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++) res += gcd(s[i], s[j]);
            sb.append(res).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}