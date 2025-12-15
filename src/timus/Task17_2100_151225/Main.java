package timus.Task17_2100_151225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        // Маршалл и Лили
        int guests = 2;

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            guests++; // сам друг

            if (s.contains("+one")) {
                guests++; // его пара
            }
        }

        // Суеверие: если ровно 13 человек — добавить манекен
        if (guests == 13) {
            guests++;
        }

        // Стоимость
        System.out.println(guests * 100);

        sc.close();
    }
}
