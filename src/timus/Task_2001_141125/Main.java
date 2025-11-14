package timus.Task_2001_141125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();

        int w1 = a3;
        int w2 = b2;

        int x = a1 - w1;
        int y = b1 - w2;

        System.out.println(x + " " + y);
    }
}
