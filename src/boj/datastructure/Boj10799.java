package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 쇠막대기
 * 문제 링크: https://www.acmicpc.net/problem/10799
 * 풀이 날짜: 2026-03-02
 */
public class Boj10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] ps = br.readLine().toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        int res = 0;

        for (int i = 0; i < ps.length; i++) {
            if (ps[i] == '(') {
                // 쇠막대기 여는 경우 혹은 레이저 시작하는 경우
                stack.push(ps[i]);
            } else if (ps[i] == ')') {
                if (ps[i - 1] == '(') {
                    // 레이저인 경우
                    stack.pop();
                    res += stack.size();
                } else {
                    // 쇠막대기 끝인 경우
                    stack.pop();
                    res += 1;
                }
            }
        }
        bw.write(String.valueOf(res));
        bw.flush();
    }
}
