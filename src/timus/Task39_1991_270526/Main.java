package timus.Task39_1991_270526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long unusedBooms = 0;
        long survivedDroids = 0;

        for (int i = 0; i < n; i++) {
            int booms = scanner.nextInt();

            if (booms > k) {
                unusedBooms += booms - k;
            } else {
                survivedDroids += k - booms;
            }
        }

        System.out.println(unusedBooms + " " + survivedDroids);
    }
}
