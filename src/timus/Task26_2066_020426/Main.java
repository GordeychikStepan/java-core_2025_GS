package timus.Task26_2066_020426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static long eval(long x, char op1, long y, char op2, long z) {
        if (op1 == '*' && op2 == '*') {
            return x * y * z;
        }
        if (op1 == '*') {
            long first = x * y;
            if (op2 == '+') {
                return first + z;
            } else {
                return first - z;
            }
        }
        if (op2 == '*') {
            long second = y * z;
            if (op1 == '+') {
                return x + second;
            } else {
                return x - second;
            }
        }

        long result;
        if (op1 == '+') {
            result = x + y;
        } else {
            result = x - y;
        }

        if (op2 == '+') {
            result += z;
        } else {
            result -= z;
        }

        return result;
    }

    private static void permute(long[] arr, boolean[] used, List<Long> current, List<long[]> result) {
        if (current.size() == 3) {
            result.add(new long[]{current.get(0), current.get(1), current.get(2)});
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(arr[i]);
                permute(arr, used, current, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine().trim());
        long b = Long.parseLong(br.readLine().trim());
        long c = Long.parseLong(br.readLine().trim());

        long[] numbers = {a, b, c};
        List<long[]> permutations = new ArrayList<long[]>();
        permute(numbers, new boolean[3], new ArrayList<Long>(), permutations);

        char[] ops = {'+', '-', '*'};
        long minValue = Long.MAX_VALUE;

        for (long[] p : permutations) {
            for (char op1 : ops) {
                for (char op2 : ops) {
                    long value = eval(p[0], op1, p[1], op2, p[2]);
                    if (value < minValue) {
                        minValue = value;
                    }
                }
            }
        }

        System.out.println(minValue);
    }
}
