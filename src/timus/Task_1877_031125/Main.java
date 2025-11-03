package timus.Task_1877_031125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int last1 = s1.charAt(3) - '0';
        int last2 = s2.charAt(3) - '0';

        boolean ok = (last1 % 2 == 0) || (last2 % 2 == 1);
        System.out.println(ok ? "yes" : "no");
    }
}
