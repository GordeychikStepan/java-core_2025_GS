package LW1;

import java.util.Scanner;

public class Example4 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num  = in.nextInt();

        System.out.println("Your number: " + num);

        in.close();
    }
}
