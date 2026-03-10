package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 소수 구하기
 * 문제 링크: https://www.acmicpc.net/problem/1929
 * 풀이 날짜: 2026-03-10
 */
public class Boj1929 {
    static int[] arr = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) continue;
            for (int j = 2 * i; j <= N; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = 2; i <= N; i++) {
            if (arr[i] != 0 && arr[i] >= M) sb.append(arr[i]).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}