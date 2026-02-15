package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 배열 합치기
 * 문제 링크: https://www.acmicpc.net/problem/11728
 * 풀이 날짜: 2026-02-15
 */
public class Boj11728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] nArr = new int[N + 1];
        int[] mArr = new int[M + 1];
        int[] resArr = new int[N + M + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) nArr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) mArr[i] = Integer.parseInt(st.nextToken());

        int nCur = 0;
        int mCur = 0;
        for (int i = 0; i < N + M; i++) {
            if (nCur < N && mCur < M) {
                resArr[i] = nArr[nCur] <= mArr[mCur] ? nArr[nCur++] : mArr[mCur++];
            } else {
                if (nCur == N) resArr[i] = mArr[mCur++];
                else if (mCur == M) resArr[i] = nArr[nCur++];
            }
        }

        for (int i = 0; i < N + M; i++) sb.append(resArr[i]).append(' ');
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
