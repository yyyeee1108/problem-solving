package misc;

import java.io.*;

public class Deque {
    static int MX = 1000005;
    static int[] dat = new int[2 * MX + 1];
    static int head = MX;
    static int tail = MX;

    static void pushFront(int x) {
        dat[--head] = x;
    }

    static void pushBack(int x) {
        dat[tail++] = x;
    }

    static void popFront() {
        head++;
    }

    static void popBack() {
        tail--;
    }

    static int front() {
        return dat[head];
    }

    static int back() {
        return dat[tail - 1];
    }

    static void test() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        pushBack(30); // 30
        sb.append(front()).append('\n'); // 30
        sb.append(back()).append('\n'); // 30
        pushFront(25); // 25 30
        pushBack(12); // 25 30 12
        sb.append(back()).append('\n'); // 12
        pushBack(62); // 25 30 12 62
        popFront(); // 30 12 62
        sb.append(front()).append('\n'); // 30
        popFront(); // 12 62
        sb.append(back()).append('\n'); // 62
        bw.write(sb.toString());
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        test();
    }
}
