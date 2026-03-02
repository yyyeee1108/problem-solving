package boj.datastructure;

import java.io.*;

/**
 * 문제 이름: 쇠막대기 - count로 풀이(스택 응용 최적화)
 * 문제 링크: https://www.acmicpc.net/problem/10799
 * 풀이 날짜: 2026-03-02
 */
public class Boj10799_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] ps = br.readLine().toCharArray();
        int cnt = 0;
        int res = 0;

        for (int i = 0; i < ps.length; i++) {
            if (ps[i] == '(') cnt++; // 쇠막대기 여는 경우 혹은 레이저 시작하는 경우
            else if (ps[i] == ')') {
                cnt--;
                if (ps[i - 1] == '(') res += cnt; // 레이저인 경우
                else res += 1; // 쇠막대기 끝인 경우
            }
        }
        bw.write(String.valueOf(res));
        bw.flush();
    }
}
