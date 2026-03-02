package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 스택 - ArrayDeque 풀이(정석)
 * 문제 링크: https://www.acmicpc.net/problem/10828
 * 풀이 날짜: 2026-03-02
 */
public class Boj10828_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("push")) stack.addFirst(Integer.parseInt(st.nextToken()));
            else if (cmd.equals("pop")) {
                if (stack.isEmpty()) sb.append(-1).append('\n');
                else sb.append(stack.removeFirst()).append('\n');
            } else if (cmd.equals("size")) sb.append(stack.size()).append('\n');
            else if (cmd.equals("empty")) sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            else if (cmd.equals("top")) {
                if (stack.isEmpty()) sb.append(-1).append('\n');
                else sb.append(stack.peekFirst()).append('\n');
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
