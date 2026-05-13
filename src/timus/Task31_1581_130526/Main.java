package timus.Task31_1581_130526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int previous = scanner.nextInt();
        int count = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();

            if (current == previous) {
                count++;
            } else {
                result.append(count).append(" ").append(previous).append(" ");
                previous = current;
                count = 1;
            }
        }

        result.append(count).append(" ").append(previous);

        System.out.println(result);
    }
}
