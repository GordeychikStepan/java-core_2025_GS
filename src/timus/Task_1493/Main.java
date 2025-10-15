package timus.Task_1493;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numStr = scanner.nextLine().trim();
        int num = Integer.parseInt(numStr);

        boolean ok = false;

        if (!numStr.equals("999999")) {
            int numNext = num + 1;
            String numNextStr = String.format("%06d", numNext);

            int nextA = 0, nextB = 0;
            for (int i = 0; i <= 2; i++) {
                nextA += Character.getNumericValue(numNextStr.charAt(i));
            }
            for (int i = 3; i <= 5; i++) {
                nextB += Character.getNumericValue(numNextStr.charAt(i));
            }

            if (nextA == nextB) ok = true;
        }

        if (!ok && !numStr.equals("000000")) {
            int numPrev = num - 1;
            String numPrevStr = String.format("%06d", numPrev);

            int prevA = 0, prevB = 0;
            for (int i = 0; i <= 2; i++) {
                prevA += Character.getNumericValue(numPrevStr.charAt(i));
            }
            for (int i = 3; i <= 5; i++) {
                prevB += Character.getNumericValue(numPrevStr.charAt(i));
            }

            if (prevA == prevB) ok = true;
        }
        System.out.println(ok ? "Yes" : "No");

        scanner.close();
    }
}
