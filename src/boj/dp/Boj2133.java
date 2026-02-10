package boj.dp;

import java.io.*;

/**
 * 문제 이름: 타일 채우기
 * 문제 링크: https://www.acmicpc.net/problem/2133
 * 풀이 날짜: 2026-02-10
 */
public class Boj2133 {

    static int[] D = new int[31];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N % 2 == 1) {
            bw.write(String.valueOf(0));
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        D[0] = 1;
        D[2] = 3;

        int prefixSum = 0;
        for (int i = 4; i <= N; i = i + 2) {
            prefixSum += D[i-4];
            D[i] = 3 * D[i - 2] + 2*prefixSum;
        }

        bw.write(String.valueOf(D[N]));
        bw.flush();
        bw.close();
        br.close();
    }
}
