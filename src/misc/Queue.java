package misc;

import java.io.*;

/**
 * Queue 직접 구현
 */
public class Queue {

    static int MX = 1000005;
    static int[] dat = new int[MX];
    static int head = 0;
    static int tail = 0;
    private static BufferedWriter bw;

    static void push(int x) {
        dat[tail++] = x;
    }

    static void pop() {
        head++;
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

        push(10);
        push(20);
        push(30);
        sb.append(front()).append('\n'); // 10
        sb.append(back()).append('\n'); // 30
        pop();
        pop();
        push(15);
        push(25);
        sb.append(front()).append('\n'); // 30
        sb.append(back()).append('\n'); // 25

        bw.write(sb.toString());
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        test();
    }
}
