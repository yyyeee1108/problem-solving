package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 나이순 정렬 - Comparator 람다식 풀이
 * 문제 링크: https://www.acmicpc.net/problem/10814
 * 풀이 날짜: 2026-02-27
 */
public class Boj10814_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(members, (m1, m2) -> m1.age - m2.age);

        for (Member m : members) {
            sb.append(m.age).append(' ').append(m.name).append('\n');
        }

        bw.write(sb.toString().trim());
        bw.flush();
    }

    static class Member {

        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
