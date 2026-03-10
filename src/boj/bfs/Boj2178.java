package boj.bfs;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 미로 탐색
 * 문제 링크: https://www.acmicpc.net/problem/2178
 * 풀이 날짜: 2026-03-10
 */
public class Boj2178 {

    static int[][] board = new int[102][102];
    static int[][] dist = new int[102][102];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                board[i][j] = input[j] - '0';
            }
        }

        for (int i = 0; i < N; i++) Arrays.fill(dist[i], -1);

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (dist[nx][ny] >= 0 || board[nx][ny] != 1) continue;
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }
        bw.write(String.valueOf(dist[N - 1][M - 1] + 1));
        bw.flush();
    }
}