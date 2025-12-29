package timus.Task19_1225_291225;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        long fibN = fib(N);          // F_N
        long ans = 2L * fibN;        // M(N) = 2*F_N

        System.out.println(ans);
    }

    // Fibonacci: F1=1, F2=1
    private static long fib(int n) {
        if (n <= 2) return 1;
        long a = 1, b = 1; // a=F1, b=F2
        for (int i = 3; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
