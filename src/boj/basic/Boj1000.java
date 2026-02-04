package boj.basic;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: A+B
 * 문제 링크: https://www.acmicpc.net/problem/1000
 * 풀이 날짜: 2026-02-04
 */
public class Boj1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a+b);
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
