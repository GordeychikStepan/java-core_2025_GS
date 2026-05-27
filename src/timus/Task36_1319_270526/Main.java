package timus.Task36_1319_270526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] table = new int[n][n];

        int number = 1;

        for (int diagonal = 0; diagonal <= 2 * n - 2; diagonal++) {
            int startRow = Math.max(0, diagonal - n + 1);
            int endRow = Math.min(n - 1, diagonal);

            for (int row = startRow; row <= endRow; row++) {
                int col = n - 1 - diagonal + row;
                table[row][col] = number;
                number++;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    result.append(" ");
                }

                result.append(table[i][j]);
            }

            if (i < n - 1) {
                result.append("\n");
            }
        }

        System.out.println(result);
    }
}
