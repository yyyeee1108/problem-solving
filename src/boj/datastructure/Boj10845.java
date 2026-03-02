package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 큐
 * 문제 링크: https://www.acmicpc.net/problem/10845
 * 풀이 날짜: 2026-03-02
 */
public class Boj10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        StringTokenizer st;
        String cmd;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();
            switch (cmd) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.poll()).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append('\n');
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append('\n');
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
