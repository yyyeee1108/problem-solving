package boj.implementation;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 2007년
 * 문제 링크: https://www.acmicpc.net/problem/1924
 * 풀이 날짜: 2026-02-04
 */
public class Boj1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // x(월) y(일) 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // x y를 단순 일수로 치환하기
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = y;
        for (int i = 1; i < x; i++) {
            days += monthDays[i];
        }

        // 문자로 맵핑하기
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        // 요일 출력하기
        sb.append(dayOfWeek[days % 7]);
        bw.write(sb.toString());
        bw.flush();

        // 리소스 해제
        br.close();
        bw.close();
    }
}
