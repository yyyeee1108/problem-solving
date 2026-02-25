package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 카드
 * 문제 링크: https://www.acmicpc.net/problem/11652
 * 풀이 날짜: 2026-02-25
 */
public class Boj11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] S = new long[N];
        for (int i = 0; i < N; i++) S[i] = Long.parseLong(br.readLine());
        Arrays.sort(S);

        int cnt = 0;
        long mxval = S[0];
        int mxcnt = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || S[i - 1] == S[i]) cnt++;
            else {
                if (cnt > mxcnt) {
                    mxcnt = cnt;
                    mxval = S[i - 1];
                }
                cnt = 1;
            }
        }
        if (cnt > mxcnt) mxval = S[N - 1];
        bw.write(String.valueOf(mxval));
        bw.flush();
    }
}
