package boj.sort;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 시리얼 번호 - comparator 풀이
 * 문제 링크: https://www.acmicpc.net/problem/1431
 * 풀이 날짜: 2026-02-25
 */
public class Boj1431_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // wrapper 클래스 없이 String 배열로 관리
        String[] serials = new String[N];
        for(int i=0; i<N;i++) serials[i] = br.readLine();

        // Array.sort와 람다식을 이용한 커스텀 정렬
        Arrays.sort(serials, (s1,s2) -> {
            // 길이 비교
            if(s1.length() != s2.length()) return s1.length()-s2.length();

            // 숫자 합 비교
            int sum1 = getSum(s1);
            int sum2 = getSum(s2);
            if(sum1!=sum2) return sum1 - sum2;

            // 사전순 비교
            return s1.compareTo(s2);
        });
    }

    // 숫자의 합 구하는 메서드
    private static int getSum(String s){
        int sum = 0;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') sum += (c - '0');
        }
        return sum;
    }
}
