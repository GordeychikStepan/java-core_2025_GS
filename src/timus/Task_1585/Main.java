package timus.Task_1585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pin1 = "Emperor Penguin", pin2 = "Little Penguin", pin3 = "Macaroni Penguin";
        int numPin1 = 0, numPin2 = 0, numPin3 = 0;


        int n = scanner.nextInt();
        String[] texts = new String[n];
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            texts[i] = scanner.nextLine().trim();

            if (texts[i].equals(pin1)) {
                numPin1++;
            } else if (texts[i].equals(pin2)) {
                numPin2++;
            } else if (texts[i].equals(pin3)) {
                numPin3++;
            }
        }

        int max = numPin1;
        String maxText = pin1;

        if (numPin2 > max) {
            max = numPin2;
            maxText = pin2;
        }
        if (numPin3 > max) {
            maxText = pin3;
        }

        System.out.println(maxText);

        scanner.close();
    }
}
