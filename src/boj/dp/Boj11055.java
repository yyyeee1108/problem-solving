package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 가장 큰 증가하는 부분 수열
 * 문제 링크: https://www.acmicpc.net/problem/11055
 * 풀이 날짜: 2026-02-10
 */
public class Boj11055 {

    static int[] D = new int[1001];
    static int[] S = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            S[i] = Integer.parseInt(st.nextToken());
            D[i] = S[i];
            for(int j = 0 ; j < i ; j++){
                if(S[j] < S[i] && D[j] + S[i] > D[i]) D[i] = D[j] + S[i];
            }
        }

        int max = 0;
        for(int d:D){
            max = Math.max(max, d);
        }
        bw.write(String.valueOf(max));
        bw.flush();

        br.close();
        bw.close();
    }
}
