package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: Base Conversion
 * 문제 링크: https://www.acmicpc.net/problem/11576
 * 풀이 날짜: 2026-03-10
 */
public class Boj11576 {

    static StringBuilder sb = new StringBuilder();

    static void solve(int[] arr, int a, int b) {
        long sum = 0;
        for (int num : arr) sum = sum * a + num;
        if (sum == 0) {
            sb.append(0);
            return;
        }

        ArrayDeque<Long> stack = new ArrayDeque<>();
        while (sum > 0) {
            stack.push(sum % b);
            sum /= b;
        }

        while (!stack.isEmpty()) sb.append(stack.removeFirst()).append(' ');
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        int[] aArr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        solve(aArr, A, B);

        bw.write(sb.toString().trim());
        bw.flush();
    }
}