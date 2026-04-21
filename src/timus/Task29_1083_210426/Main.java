package timus.Task29_1083_210426;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int step = s.length();
        long result = 1;

        for (int i = n; i > 0; i -= step) {
            result *= i;
        }

        System.out.println(result);
    }
}
