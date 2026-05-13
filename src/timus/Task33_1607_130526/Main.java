package timus.Task33_1607_130526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int petyaPrice = scanner.nextInt();
        int petyaStep = scanner.nextInt();
        int taxiPrice = scanner.nextInt();
        int taxiStep = scanner.nextInt();

        while (true) {
            if (petyaPrice >= taxiPrice) {
                System.out.println(petyaPrice);
                return;
            }

            petyaPrice += petyaStep;

            if (petyaPrice >= taxiPrice) {
                System.out.println(taxiPrice);
                return;
            }

            taxiPrice -= taxiStep;

            if (taxiPrice <= petyaPrice) {
                System.out.println(petyaPrice);
                return;
            }
        }
    }
}
