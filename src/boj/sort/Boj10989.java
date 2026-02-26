package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 수 정렬하기 3
 * 문제 링크: https://www.acmicpc.net/problem/10989
 * 풀이 날짜: 2026-02-27
 */
public class Boj10989 {
    static int[] cnt = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) cnt[Integer.parseInt(br.readLine())]++;
        for (int i = 1; i <= 10000; i++) {
            if (cnt[i] > 0) {
                String s = i + "\n";
                while (cnt[i]-- > 0) {
                    bw.write(s);
                }
            }
        }
        bw.flush();
    }
}
