package boj.basic;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: A+B - 5
 * 문제 링크: https://www.acmicpc.net/problem/10952
 * 풀이 날짜: 2026-02-04
 */
public class Boj10952 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0) break;
            sb.append(a+b).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
