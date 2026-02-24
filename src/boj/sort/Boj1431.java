package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 시리얼 번호
 * 문제 링크: https://www.acmicpc.net/problem/1431
 * 풀이 날짜: 2026-02-25
 */
public class Boj1431 {

    static class Serial implements Comparable<Serial> {

        String code;

        Serial(String code) {
            this.code = code;
        }

        @Override
        public int compareTo(Serial s) {
            if (this.code.length() != s.code.length()) return this.code.length() - s.code.length();

            int thisC = getDigitSum(this.code);
            int sC = getDigitSum(s.code);
            if (thisC != sC) return thisC - sC;

            return this.code.compareTo(s.code);
        }

        private int getDigitSum(String s) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') sum += c - '0';
            }
            return sum;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Serial> list = new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(new Serial(br.readLine()));
        Collections.sort(list);

        for (Serial s : list) {
            sb.append(s.code).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
