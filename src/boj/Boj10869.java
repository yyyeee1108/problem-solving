package boj;

import java.util.Scanner;

/**
 * 문제 이름: 사칙연산
 * 문제 링크: https://www.acmicpc.net/problem/10869
 * 풀이 날짜: 2026-01-02
 */
public class Boj10869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

        sc.close();
    }
}
