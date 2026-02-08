package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: ACM 호텔
 * 문제 링크: https://www.acmicpc.net/problem/10250
 * 풀이 날짜: 2026-02-09
 */
public class Boj10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int num = N/H+1;
            int f = N%H;
            if(N%H==0) {
                num = N/H;
                f = H;
            }
            sb.append(100*(f)+num).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
