package timus.Task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte a = scanner.nextByte();
        byte b = scanner.nextByte();
        byte all = (byte)(a + b - 1);

        System.out.println((all - a) + " " + (all - b));

        scanner.close();
    }
}
