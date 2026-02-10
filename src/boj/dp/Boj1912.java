package boj.dp;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 이름: 연속합
 * 문제 링크: https://www.acmicpc.net/problem/1912
 * 풀이 날짜: 2026-02-10
 */
public class Boj1912 {

    static int[] D = new int[100001];
    static int[] S = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        S[0] = Integer.parseInt(st.nextToken());
        D[0] = S[0];
        for (int i = 1; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
            if(D[i-1] < 0 && S[i] < 0){
                D[i] = S[i];
            } else{
                D[i] = Math.max(D[i - 1] + S[i], S[i]);
            }
        }

        int max = -1001;
        for (int i = 0; i < N ; i++) {
            max = Math.max(max, D[i]);
        }

        bw.write(String.valueOf(max));
        bw.flush();

        bw.close();
        br.close();
    }
}
