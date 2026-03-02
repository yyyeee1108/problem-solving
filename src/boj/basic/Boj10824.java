package boj.basic;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 네 수
 * 문제 링크: https://www.acmicpc.net/problem/10824
 * 풀이 날짜: 2026-03-03
 */
public class Boj10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long res = Long.parseLong(st.nextToken() + st.nextToken()) + Long.parseLong(st.nextToken() + st.nextToken());
        bw.write(String.valueOf(res));
        bw.flush();
    }
}
