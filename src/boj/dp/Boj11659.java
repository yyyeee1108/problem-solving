package boj.dp;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 구간 합 구하기 4
 * 문제 링크: https://www.acmicpc.net/problem/11659
 * 풀이 날짜: 2026-02-06
 */
public class Boj11659 {

    static int[] D = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        D[0] = 0;
        D[1] = Integer.parseInt(st.nextToken());
        for(int i=2;i<=N;i++){
            D[i] = D[i-1] + Integer.parseInt(st.nextToken());
        }

        while(M-- > 0){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(D[j]-D[i-1]).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
