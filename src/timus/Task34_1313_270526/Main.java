package timus.Task34_1313_270526;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (int sum = 0; sum <= 2 * n - 2; sum++) {
            int startRow = Math.min(sum, n - 1);
            int endRow = Math.max(0, sum - n + 1);

            for (int row = startRow; row >= endRow; row--) {
                int col = sum - row;

                if (!first) {
                    result.append(" ");
                }

                result.append(matrix[row][col]);
                first = false;
            }
        }

        System.out.println(result);
    }
}
