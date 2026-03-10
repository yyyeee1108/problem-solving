package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 소수 찾기
 * 문제 링크: https://www.acmicpc.net/problem/1978
 * 풀이 날짜: 2026-03-10
 */
public class Boj1978 {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int res = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(Integer.parseInt(st.nextToken()))) res += 1;
        }

        bw.write(String.valueOf(res));
        bw.flush();
    }
}