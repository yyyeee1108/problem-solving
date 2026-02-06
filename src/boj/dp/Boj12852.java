package boj.dp;

import java.io.*;

/**
 * 문제 이름: 1로 만들기 2
 * 문제 링크: https://www.acmicpc.net/problem/12852
 * 풀이 날짜: 2026-02-06
 */
public class Boj12852 {

    static int[] D = new int[1000001];
    static int[] pre = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        D[1] = 0;
        for(int i=2; i <= N ; i++){
            D[i] = D[i-1] + 1;
            pre[i] = i-1;
            if(i%2 == 0 && D[i/2] < D[i]){
                D[i] = D[i / 2] + 1;
                pre[i] = i/2;
            }
            if(i%3==0 && D[i/3] < D[i]){
                D[i] = D[i/3] + 1;
                pre[i] = i/3;
            }
        }

        sb.append(D[N]).append('\n');
        int cur = N;
        while(true){
            sb.append(cur).append(" ");
            if(cur == 1) break;
            cur = pre[cur];
        }
        bw.write(sb.toString().trim());
        bw.flush();
        br.close();
        bw.close();
    }
}
