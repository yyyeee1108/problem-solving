package boj;

import java.io.*;

/**
 * 문제 이름: 합
 * 문제 링크: https://www.acmicpc.net/problem/8393
 * 풀이 날짜: 2026-02-04
 */
public class Boj8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while (n > 0) {
            sum += n--;
        }
        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
