package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 알파벳 찾기
 * 문제 링크: https://www.acmicpc.net/problem/10809
 * 풀이 날짜: 2026-03-03
 */
public class Boj10809 {

    static int[] alph = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Arrays.fill(alph, -1);

        char[] arr = br.readLine().toCharArray();
        int alphIdx;
        for (int i = 0; i < arr.length; i++) {
            alphIdx = arr[i] - 'a';
            if (alph[alphIdx] == -1) alph[alphIdx] = i;
        }

        for (int i : alph) sb.append(i).append(' ');
        bw.write(sb.toString());
        bw.flush();
    }
}
