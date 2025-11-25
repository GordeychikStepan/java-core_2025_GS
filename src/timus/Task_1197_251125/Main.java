package timus.Task_1197_251125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        //
        int[] dx = { 1, 2,  2,  1, -1, -2, -2, -1 };
        int[] dy = { 2, 1, -1, -2, -2, -1,  1,  2 };

        for (int t = 0; t < N; t++) {
            String cell = in.next();

            int x = cell.charAt(0) - 'a' + 1;
            int y = cell.charAt(1) - '0';

            int count = 0;

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
