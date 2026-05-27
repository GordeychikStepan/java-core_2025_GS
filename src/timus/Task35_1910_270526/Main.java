package timus.Task35_1910_270526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sections = new int[n];

        for (int i = 0; i < n; i++) {
            sections[i] = scanner.nextInt();
        }

        int maxSum = -1;
        int middleSection = 0;

        for (int i = 0; i <= n - 3; i++) {
            int currentSum = sections[i] + sections[i + 1] + sections[i + 2];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                middleSection = i + 2;
            }
        }

        System.out.println(maxSum + " " + middleSection);
    }
}
