package timus.Task23_2023_110326;

import java.util.Scanner;

public class Main {

    public static int getCase(String name) {
        switch (name) {
            case "Alice":
            case "Ariel":
            case "Aurora":
            case "Phil":
            case "Peter":
            case "Olaf":
            case "Phoebus":
            case "Ralph":
            case "Robin":
                return 1;

            case "Bambi":
            case "Belle":
            case "Bolt":
            case "Mulan":
            case "Mowgli":
            case "Mickey":
            case "Silver":
            case "Simba":
            case "Stitch":
                return 2;

            default:
                return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int currentCase = 1;
        int steps = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int targetCase = getCase(name);

            steps += Math.abs(currentCase - targetCase);
            currentCase = targetCase;
        }

        System.out.println(steps);
    }
}
