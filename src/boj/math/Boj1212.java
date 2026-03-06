package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 8진수 2진수
 * 문제 링크: https://www.acmicpc.net/problem/1212
 * 풀이 날짜: 2026-03-06
 */
public class Boj1212 {

    static StringBuilder res = new StringBuilder();

    static String[] binTable = {"000", "001", "010", "011", "100", "101", "110", "111"};

    static void solve(char[] octa) {
        for (int i = 0; i < octa.length; i++) {
            int o = octa[i] - '0';

            if (i == 0) res.append(Integer.parseInt(binTable[o]));
            else res.append(binTable[o]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        solve(br.readLine().toCharArray());
        bw.write(res.toString());
        bw.flush();
    }
}