package boj.dp;

import java.io.*;

/**
 * 문제 이름: 암호코드
 * 문제 링크: https://www.acmicpc.net/problem/2011
 * 풀이 날짜: 2026-02-13
 */
public class Boj2011 {

    static int[] D = new int[5001];
    static int[] S = new int[5001];
    static int MOD = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            S[i + 1] = str.charAt(i) - '0';
            if (i == 0 && S[i + 1] == 0) {
                bw.write(String.valueOf(0));
                bw.flush();
                return;
            }
        }

        D[0] = 1;
        D[1] = 1;
        for (int i = 2; i <= str.length(); i++) {
            if (S[i] == 0) {
                if ((S[i - 1] != 1 && S[i - 1] != 2)) {
                    bw.write(String.valueOf(0));
                    bw.flush();
                    return;
                } else {
                    D[i] = (D[i - 2]) % MOD;
                }
                continue;
            }
            if (S[i - 1] == 0) {
                D[i] = (D[i - 1]) % MOD;
                continue;
            }
            D[i] = S[i - 1] * 10 + S[i] <= 26 ? (D[i - 1] + D[i - 2]) % MOD : (D[i - 1]) % MOD;
        }

        bw.write(String.valueOf(D[str.length()]));
        bw.flush();

        bw.close();
        br.close();
    }
}
