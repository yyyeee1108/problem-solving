package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: K번째 수
 * 문제 링크: https://www.acmicpc.net/problem/11004
 * 풀이 날짜: 2026-02-27
 */
public class Boj11004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        bw.write(String.valueOf(A[K-1]));
        bw.flush();
    }
}
