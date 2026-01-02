package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 문제 이름: OX퀴즈
 * 문제 링크: https://www.acmicpc.net/problem/8958
 * 풀이 날짜: 2026-01-02
 */
public class Boj8958 {
    public static void main(String[] args) {
        exam1();
        exam2();
    }

    private static void exam1() {
        System.out.println("==이전(일반적인 방식)==");
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

    private static void exam2() {
        System.out.println("==이후(최적화 된 방식)==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            // 테스트 케이스 개수 받기
            int N = Integer.parseInt(br.readLine());

            // readLine(): 입력
            // toCharArray(): 입력받은 문자열을 문자 배열로 변경
            while (N-- > 0) {
                char[] rs = br.readLine().toCharArray(); // ['O', 'X', 'O' ...]
                int score = 0;
                int stack = 0;

                for (char c : rs) {
                    if (c == 'O') {
                        score += ++stack;
                        // score = score + (++initNum)
                        // 증감연산자가 사칙연산보다 우선순위
                    } else {
                        stack = 0;
                    }
                }

                sb.append(score).append("\n");
            }
            System.out.println(sb);
            br.close(); // Scanner처럼 리소스 정리
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
