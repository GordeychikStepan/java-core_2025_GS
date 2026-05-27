package timus.Task38_1327_270526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int oddUntilB = (b + 1) / 2;
        int oddBeforeA = a / 2;

        int result = oddUntilB - oddBeforeA;

        System.out.println(result);
    }
}
