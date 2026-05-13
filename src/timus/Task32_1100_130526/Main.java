package timus.Task32_1100_130526;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner scanner = new FastScanner();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();

        int[] ids = new int[n];
        byte[] solvedTasks = new byte[n];

        for (int i = 0; i < n; i++) {
            ids[i] = scanner.nextInt();
            solvedTasks[i] = (byte) scanner.nextInt();
        }

        for (int solved = 100; solved >= 0; solved--) {
            for (int i = 0; i < n; i++) {
                if (solvedTasks[i] == solved) {
                    writer.write(String.valueOf(ids[i]));
                    writer.write(" ");
                    writer.write(String.valueOf(solved));
                    writer.newLine();
                }
            }
        }

        writer.flush();
    }

    private static class FastScanner {
        private final InputStream input = System.in;
        private final byte[] buffer = new byte[8192];
        private int pointer = 0;
        private int length = 0;

        private int read() throws IOException {
            if (pointer >= length) {
                length = input.read(buffer);
                pointer = 0;

                if (length <= 0) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int value = 0;

            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }

            return value;
        }
    }
}