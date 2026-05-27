package LW13.Tasks;

import java.util.Scanner;

/*  Программа выводит столбец матрицы по номеру, заданному с клавиатуры.
    Обрабатываются ошибки: ввод строки вместо числа и отсутствие столбца
    с указанным номером. */

public class Task02_MatrixColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        try (Scanner scanner = new Scanner(System.in)) {
            printMatrix(matrix);

            System.out.print("Введите номер столбца от 1 до " + matrix[0].length + ": ");

            int columnNumber = readInt(scanner);
            int[] column = getColumn(matrix, columnNumber - 1);

            System.out.println("Выбранный столбец:");
            for (int value : column) {
                System.out.println(value);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: номер столбца должен быть целым числом.");
            System.out.println("Подробности: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Ошибка типа данных: номер столбца выходит за диапазон типа int.");
            System.out.println("Подробности: " + e.getMessage());

        } catch (ColumnNotFoundException e) {
            System.out.println("Ошибка выбора столбца: " + e.getMessage());

        } finally {
            System.out.println("Работа программы завершена.");
        }
    }

    private static int readInt(Scanner scanner) {
        String token = scanner.next();

        if (!token.matches("-?\\d+")) {
            throw new NumberFormatException("введено не целое число: " + token);
        }

        try {
            return Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new ArithmeticException("введенное число не помещается в диапазон int: " + token);
        }
    }

    private static int[] getColumn(int[][] matrix, int columnIndex) throws ColumnNotFoundException {
        if (columnIndex < 0 || columnIndex >= matrix[0].length) {
            throw new ColumnNotFoundException("столбца с таким номером нет");
        }

        int[] column = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            column[row] = matrix[row][columnIndex];
        }

        return column;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Матрица:");

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    private static class ColumnNotFoundException extends Exception {
        public ColumnNotFoundException(String message) {
            super(message);
        }
    }
}
