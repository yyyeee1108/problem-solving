package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 가장 긴 바이토닉 부분 수열
 * 문제 링크: https://www.acmicpc.net/problem/11054
 * 풀이 날짜: 2026-02-10
 */
public class Boj11054 {

    static int[] DF = new int[1001];
    static int[] DR = new int[1001];
    static int[] S = new int[1001];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            DF[i] = 1;
            for (int j = 0; j < i; j++) {
                if (S[j] < S[i] && DF[j] + 1 > DF[i]) {
                    DF[i] = DF[j] + 1;
                }
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            DR[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (S[j] < S[i] && DR[j] + 1 > DR[i]) {
                    DR[i] = DR[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, DF[i] + DR[i]);
        }

        bw.write(String.valueOf(max - 1));
        bw.flush();

        bw.close();
        br.close();
    }
}
