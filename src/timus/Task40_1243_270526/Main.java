package timus.Task40_1243_270526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();

        int remainder = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % 7;
        }

        System.out.println(remainder);
    }
}
