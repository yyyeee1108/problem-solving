package boj.basic;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: A+B - 4
 * 문제 링크: https://www.acmicpc.net/problem/10951
 * 풀이 날짜: 2026-02-04
 */
public class Boj10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String line;
        while((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line);
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
