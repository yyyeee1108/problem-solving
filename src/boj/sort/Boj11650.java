package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 좌표 정렬하기
 * 문제 링크: https://www.acmicpc.net/problem/11650
 * 풀이 날짜: 2026-02-25
 */
public class Boj11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        for (int i = 0; i < N; i++) sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');

        bw.write(sb.toString());
        bw.flush();
    }
}
