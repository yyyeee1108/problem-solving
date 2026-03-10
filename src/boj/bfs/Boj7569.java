package boj.bfs;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 토마토 - 3차원
 * 문제 링크: https://www.acmicpc.net/problem/7569
 * 풀이 날짜: 2026-03-10
 */
public class Boj7569 {

    static int[][][] board = new int[102][102][102];
    static int[] dx = {1, 0, -1, 0, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[][][] dist = new int[102][102][102];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        Queue<int[]> queue = new ArrayDeque<>();

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    board[i][j][k] = Integer.parseInt(st.nextToken());
                    if (board[i][j][k] == 1) queue.offer(new int[]{i, j, k});
                    if (board[i][j][k] == 0) dist[i][j][k] = -1;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int dir = 0; dir < 6; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];
                int nz = cur[2] + dz[dir];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M || nz < 0 || nz >= H) continue;
                if (dist[nx][ny][nz] >= 0) continue;
                dist[nx][ny][nz] = dist[cur[0]][cur[1]][cur[2]] + 1;
                queue.offer(new int[]{nx, ny, nz});
            }
        }

        int res = 0;
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (dist[i][j][k] == -1) {
                        bw.write(String.valueOf(-1));
                        bw.flush();
                        return;
                    }
                    res = Math.max(res, dist[i][j][k]);
                }
            }
        }
        bw.write(String.valueOf(res));
        bw.flush();
    }
}