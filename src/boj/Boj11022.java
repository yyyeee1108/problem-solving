package boj;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: A+B - 8
 * 문제 링크: https://www.acmicpc.net/problem/11022
 * 풀이 날짜: 2026-02-04
 */
public class Boj11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ")
                    .append(a).append(" + ").append(b).append(" = ").append(a + b)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
