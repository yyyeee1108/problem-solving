package boj;

import java.io.*;

/**
 * 문제 이름: 별 찍기 - 17
 * 문제 링크: https://www.acmicpc.net/problem/10992
 * 풀이 날짜: 2026-02-04
 */
public class Boj10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        if(N==1){
            sb.append('*').append('\n');
        } else{
            sb.append(" ".repeat(N-1)).append('*').append('\n');
            for(int i = 1 ; i < N-1 ; i++){
                sb.append(" ".repeat(N-i-1))
                        .append('*')
                        .append(" ".repeat(2*i-1))
                        .append('*').append('\n');
            }
            sb.append("*".repeat(2*N-1)).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}