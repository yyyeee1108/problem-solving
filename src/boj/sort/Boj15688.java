package boj.sort;

import java.io.*;

/**
 * 문제 이름: 수 정렬하기 5
 * 문제 링크: https://www.acmicpc.net/problem/15688
 * 풀이 날짜: 2026-02-16
 */
public class Boj15688 {
    static int[] freq = new int[2000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int d = Integer.parseInt(br.readLine());
            freq[d + 1000000]++;
        }

        for (int i = 0; i <= 2000000; i++) {
            while (freq[i]-- > 0) {
                sb.append(i - 1000000).append('\n');
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
