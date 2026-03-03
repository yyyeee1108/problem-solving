package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 요세푸스 문제
 * 문제 링크: https://www.acmicpc.net/problem/1158
 * 풀이 날짜: 2026-03-03
 */
public class Boj1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) queue.offer(i);

        sb.append('<');
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(queue.isEmpty() ? '>' : ", ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
