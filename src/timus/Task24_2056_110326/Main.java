package timus.Task24_2056_110326;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        boolean hasThree = false;
        boolean allFive = true;

        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();
            sum += mark;

            if (mark == 3) {
                hasThree = true;
            }

            if (mark != 5) {
                allFive = false;
            }
        }

        if (hasThree) {
            System.out.println("None");
        } else if (allFive) {
            System.out.println("Named");
        } else {
            double average = (double) sum / n;
            if (average >= 4.5) {
                System.out.println("High");
            } else {
                System.out.println("Common");
            }
        }
    }
}
