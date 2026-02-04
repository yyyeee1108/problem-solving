package boj.basic;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제 이름: 빠른 A+B
 * 문제 링크: https://www.acmicpc.net/problem/15552
 * 풀이 날짜: 2026-01-03
 */
public class Boj15552 {
    public static void main(String[] args) throws IOException {
        // 필요한 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // BufferedReader, StringTokenizer 이용하여 tc 입력받기
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            // 각각마다 계산
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
        // BufferedWriter로 출력하기
        bw.write(sb.toString());
        // 리소스 정리
        bw.flush();
        bw.close();
        br.close();
    }
}
