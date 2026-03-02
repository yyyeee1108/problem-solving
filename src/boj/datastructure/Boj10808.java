package boj.datastructure;

import java.io.*;

/**
 * 문제 이름: 알파벳 개수
 * 문제 링크: https://www.acmicpc.net/problem/10808
 * 풀이 날짜: 2026-03-03
 */
public class Boj10808 {

    static int[] alph = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();
        for (char c : arr) {
            alph[c - 'a']++;
        }
        for (int i : alph) {
            sb.append(i).append(' ');
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
