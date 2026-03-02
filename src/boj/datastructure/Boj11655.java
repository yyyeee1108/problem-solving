package boj.datastructure;

import java.io.*;

/**
 * 문제 이름: ROT13
 * 문제 링크: https://www.acmicpc.net/problem/11655
 * 풀이 날짜: 2026-03-03
 */
public class Boj11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] S = br.readLine().toCharArray();
        for (char s : S) {
            if ('A' <= s && s <= 'Z') sb.append((char) ((s - 'A' + 13) % 26 + 'A'));
            else if ('a' <= s && s <= 'z') sb.append((char) ((s - 'a' + 13) % 26 + 'a'));
            else sb.append(s);
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
