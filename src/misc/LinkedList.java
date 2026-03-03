package misc;

import java.io.*;
import java.util.*;

public class LinkedList {

    static int MX = 1000005;
    static int[] dat = new int[MX];
    static int[] pre = new int[MX];
    static int[] nxt = new int[MX];
    static int unused = 1;
    static StringBuilder sb = new StringBuilder();

    static void insert(int addr, int num) {
        dat[unused] = num;
        pre[unused] = addr;
        nxt[unused] = nxt[addr];
        if (nxt[addr] != -1) pre[nxt[addr]] = unused;
        nxt[addr] = unused;
        unused++;
    }

    static void erase(int addr) {
        nxt[pre[addr]] = nxt[addr];
        if (nxt[addr] != -1) pre[nxt[addr]] = pre[addr];
    }

    static void traverse() {
        int cur = nxt[0];
        while (cur != -1) {
            sb.append(dat[cur]).append(' ');
            cur = nxt[cur];
        }
        sb.append("\n\n");
    }

    static void insertTest() {
        sb.append("******* insert test *******\n");
        insert(0, 10); // 10(address=1)
        traverse();
        insert(0, 30); // 30(address=2) 10
        traverse();
        insert(2, 40); // 30 40(address=3) 10
        traverse();
        insert(1, 20); // 30 40 10 20(address=4)
        traverse();
        insert(4, 70); // 30 40 10 20 70(address=5)
        traverse();
    }

    static void eraseTest() {
        sb.append("******* erase test *******\n");
        erase(1); // 30 40 20 70
        traverse();
        erase(2); // 40 20 70
        traverse();
        erase(4); // 40 70
        traverse();
        erase(5); // 40
        traverse();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Arrays.fill(pre, -1);
        Arrays.fill(nxt, -1);
        insertTest();
        eraseTest();

        bw.write(sb.toString());
        bw.flush();
    }
}
