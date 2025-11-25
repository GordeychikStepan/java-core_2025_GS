package timus.Task_1820_251125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int sides = 2 * n;

        int minutes = (sides + k - 1) / k;

        if (minutes < 2) {
            minutes = 2;
        }

        System.out.println(minutes);
    }
}
