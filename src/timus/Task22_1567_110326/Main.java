package timus.Task22_1567_110326;

import java.util.Scanner;

public class Main {

    public static int cost(char ch) {
        if ("adgjmpsvy. ".indexOf(ch) != -1) return 1;
        if ("behknqtwz,".indexOf(ch) != -1) return 2;
        if ("cfilorux!".indexOf(ch) != -1) return 3;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += cost(s.charAt(i));
        }

        System.out.println(sum);
    }
}
