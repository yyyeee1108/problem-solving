package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 국영수
 * 문제 링크: https://www.acmicpc.net/problem/10825
 * 풀이 날짜: 2026-02-27
 */
public class Boj10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Student[] students = new Student[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students, (s1, s2) -> {
            if (s1.korean != s2.korean) return s2.korean - s1.korean;
            if (s1.english != s2.english) return s1.english - s2.english;
            if (s1.math != s2.math) return s2.math - s1.math;
            return s1.name.compareTo(s2.name);
        });

        for (Student s : students) {
            sb.append(s.name).append('\n');
        }
        bw.write(sb.toString().trim());
        bw.flush();
    }

    static class Student {
        String name;
        int korean;
        int english;
        int math;

        Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}
