package boj.math;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 2진수 8진수
 * 문제 링크: https://www.acmicpc.net/problem/1373
 * 풀이 날짜: 2026-03-05
 */
public class Boj1373 {

    static StringBuilder res = new StringBuilder();

    static void solve(String bin) {
        char[] cbin = bin.toCharArray();

        for (int i = bin.length() - 1; i >= 0; i -= 3) {
            int octa = 0;
            octa += (cbin[i] - '0');
            if (i - 1 >= 0) octa += (cbin[i - 1] - '0') * 2;
            if (i - 2 >= 0) octa += (cbin[i - 2] - '0') * 4;
            res.append(octa);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        solve(br.readLine());
        bw.write(res.reverse().toString());
        bw.flush();
    }
}