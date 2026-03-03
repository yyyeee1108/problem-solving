package boj.datastructure;

import java.io.*;
import java.util.*;

/**
 * 문제 이름: 에디터
 * 문제 링크: https://www.acmicpc.net/problem/1406
 * 풀이 날짜: 2026-03-03
 */
public class Boj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        ListIterator<Character> iter = list.listIterator();
        for (Character c : str.toCharArray()) iter.add(c);
        while (M-- > 0) {
            String cmd = br.readLine();
            if (cmd.equals("L") && iter.hasPrevious()) iter.previous();
            else if (cmd.equals("D") && iter.hasNext()) iter.next();
            else if (cmd.equals("B") && iter.hasPrevious()) {
                iter.previous();
                iter.remove();
            } else if (cmd.startsWith("P")) {
                iter.add(cmd.charAt(2));
            }
        }
        for (Character c : list) {
            sb.append(c);
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
