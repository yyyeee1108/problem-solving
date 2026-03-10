package boj.bfs;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 그림
 * 문제 링크: https://www.acmicpc.net/problem/1926
 * 풀이 날짜: 2026-03-10
 */
public class Boj1926 {

    static int[][] board = new int[502][502];
    static boolean[][] vis = new boolean[502][502];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int mx = 0; // 그림의 최대값
        int num = 0; // 그림의 수
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0 || vis[i][j]) continue;

                num++; // 그림 수 증가
                Queue<int[]> queue = new ArrayDeque<>();
                vis[i][j] = true;
                queue.offer(new int[]{i, j});
                int size = 0; // 그림 넓이
                while (!queue.isEmpty()) {
                    size++;
                    int[] cur = queue.poll();
                    for (int dir = 0; dir < 4; dir++) {
                        int nx = cur[0] + dx[dir];
                        int ny = cur[1] + dy[dir];

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if (vis[nx][ny] || board[nx][ny] != 1) continue;

                        vis[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
                mx = Math.max(mx, size);
            }
        }
        sb.append(num).append('\n').append(mx);
        bw.write(sb.toString());
        bw.flush();
    }
}