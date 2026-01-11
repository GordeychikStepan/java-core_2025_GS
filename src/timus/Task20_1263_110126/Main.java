package timus.Task20_1263_110126;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt(); // кандидаты
        int m = fs.nextInt(); // избиратели

        int[] cnt = new int[n + 1];
        for (int i = 0; i < m; i++) cnt[fs.nextInt()]++;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            double p = cnt[i] * 100.0 / m;
            sb.append(String.format(Locale.US, "%.2f%%", p)).append('\n'); // <-- %% печатает '%'
        }
        System.out.print(sb.toString());
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

        int nextInt() throws IOException {
            int c;
            do { c = read(); } while (c <= ' ' && c != -1);
            int sgn = 1;
            if (c == '-') { sgn = -1; c = read(); }
            int x = 0;
            while (c > ' ') {
                x = x * 10 + (c - '0');
                c = read();
            }
            return x * sgn;
        }
    }
}
