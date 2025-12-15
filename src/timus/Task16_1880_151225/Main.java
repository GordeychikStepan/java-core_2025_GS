package timus.Task16_1880_151225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        long[] a = new long[n1];
        for (int i = 0; i < n1; i++) a[i] = sc.nextLong();

        int n2 = sc.nextInt();
        long[] b = new long[n2];
        for (int i = 0; i < n2; i++) b[i] = sc.nextLong();

        int n3 = sc.nextInt();
        long[] c = new long[n3];
        for (int i = 0; i < n3; i++) c[i] = sc.nextLong();

        int i = 0, j = 0, k = 0;
        int count = 0;

        // Три указателя — линейный проход
        while (i < n1 && j < n2 && k < n3) {
            if (a[i] == b[j] && b[j] == c[k]) {
                count++;
                i++;
                j++;
                k++;
            } else {
                long min = Math.min(a[i], Math.min(b[j], c[k]));
                if (a[i] == min) i++;
                if (b[j] == min) j++;
                if (c[k] == min) k++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
