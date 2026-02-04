package boj.string;

import java.io.*;

/**
 * 문제 이름: 문자열 교환
 * 문제 링크: https://www.acmicpc.net/problem/1522
 * 풀이 날짜: 2026-01-04
 */
public class Boj1522 {
    public static void main(String[] args) throws IOException {
        // 필요한 객체, 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] data = br.readLine().toCharArray();
        int totalCount = data.length;
        int aCount = 0;
        int stack=0;
        for(char c: data){
            if(c=='a'){
                aCount++;
                stack++;
            }else{
                stack=0;
            }
        }
        if(aCount == 0 || (aCount > 0 && aCount == stack)){
            bw.write(0+"\n");
        } else {
            int minCount = 1000;
            int start = 0;
            int end = start+aCount - 1;
            if(start == end){
                minCount = 0;
            } else{
                while (start < totalCount) {
                    int bCount = 0;
                    if (start < end) {
                        for (int i = start; i <= end; i++) {
                            if (data[i] == 'b') {
                                bCount++;
                            }
                        }
                    } else {
                        for (int i = 0; i <= end; i++) {
                            if (data[i] == 'b') {
                                bCount++;
                            }
                        }
                        for (int i = start; i < totalCount; i++) {
                            if (data[i] == 'b') {
                                bCount++;
                            }
                        }
                    }
                    if (bCount < minCount) {
                        minCount = bCount;
                    }
                    start = start + 1;
                    end = (end + 1) % totalCount;
                }
            }

            bw.write(minCount + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
