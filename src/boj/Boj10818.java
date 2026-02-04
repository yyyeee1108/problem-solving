package boj;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 최소, 최대
 * 문제 링크: https://www.acmicpc.net/problem/10818
 * 풀이 날짜: 2026-02-04
 */
public class Boj10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int min = 1000000;
        int max = -1000000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N-- > 0){
            int current = Integer.parseInt(st.nextToken());
            min = Math.min(min, current);
            max = Math.max(max, current);
        }

        sb.append(min).append(" ").append(max).append('\n');
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
