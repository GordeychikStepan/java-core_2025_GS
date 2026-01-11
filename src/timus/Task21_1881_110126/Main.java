package timus.Task21_1881_110126;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int h = fs.nextInt();
        int w = fs.nextInt();
        int n = fs.nextInt();

        int lines = 1;
        int used = 0; // сколько символов занято в текущей строке

        for (int i = 0; i < n; i++) {
            String s = fs.next();
            int len = s.length();

            if (used == 0) {
                used = len;
            } else if (used + 1 + len <= w) {
                used += 1 + len;
            } else {
                lines++;
                used = len;
            }
        }

        int pages = (lines + h - 1) / h;
        System.out.print(pages);
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buf = new byte[1 << 16];
        private int len = 0, ptr = 0;

        FastScanner(InputStream in) { this.in = in; }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buf);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buf[ptr++];
        }

        int nextInt() throws IOException { return Integer.parseInt(next()); }

        String next() throws IOException {
            int c;
            do { c = read(); } while (c <= ' ' && c != -1);
            StringBuilder sb = new StringBuilder();
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }
    }
}
