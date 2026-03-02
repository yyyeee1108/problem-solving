package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 괄호
 * 문제 링크: https://www.acmicpc.net/problem/9012
 * 풀이 날짜: 2026-02-28
 */
public class Boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char[] ps = br.readLine().toCharArray();
            sb.append(solve(ps) ? "YES" : "NO").append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }

    static boolean solve(char[] ps) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : ps) {
            if (c == '(') stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
