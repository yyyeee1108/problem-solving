package boj.string;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 알파벳 찾기
 * 문제 링크: https://www.acmicpc.net/problem/10809
 * 풀이 날짜: 2026-02-07
 */
public class Boj10809 {

    static int[] A = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 미리 알파벳 배열 26 생성 -1로 초기화
        Arrays.fill(A,-1);

        // 단어 입력 받기
        char[] word = br.readLine().toCharArray();

        // for문으로 인덱스 돌면서 -1이면 처음 등장하는 위치 찍기
        for(int i = 0 ; i < word.length ; i++){
            if(A[word[i]-'a'] == -1){
                A[word[i] - 'a'] = i;
            }
        }

        for(int a : A){
            sb.append(a).append(' ');
        }
        bw.write(sb.toString().trim());
        bw.flush();

        bw.close();
        br.close();
    }
}
