package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 나머지
 * 문제 링크: https://www.acmicpc.net/problem/10430
 * 풀이 날짜: 2026-03-04
 */
public class Boj10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        sb.append((A + B) % C).append('\n');
        sb.append(((A % C) + (B % C)) % C).append('\n');
        sb.append((A * B) % C).append('\n');
        sb.append(((A % C) * (B % C)) % C);

        bw.write(sb.toString());
        bw.flush();
    }
}