package boj;

import java.util.Scanner;

/**
 * 문제 이름: OX퀴즈
 * 문제 링크: https://www.acmicpc.net/problem/8958
 * 풀이 날짜: 2026-01-02
 */
public class Boj8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int N = sc.nextInt();
        sc.nextLine();
        */

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String rs = sc.nextLine();
            int score = 0;
            int stack = 0;
            for (int j = 0; j < rs.length(); j++) {
                if (rs.charAt(j) == 'O') {
                    stack += 1;
                    score += stack;
                } else {
                    stack = 0;
                }
            }
            System.out.println(score);
        }
    }
}
