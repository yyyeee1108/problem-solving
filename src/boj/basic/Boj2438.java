package boj.basic;

import java.util.Scanner;

/**
 * 문제 이름: 별 찍기 - 1
 * 문제 링크: https://www.acmicpc.net/problem/2438
 * 풀이 날짜: 2026-01-02
 */
public class Boj2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
