package LW13.Tasks;

import java.util.Scanner;

/*  В программе вычисляется среднее значение среди положительных элементов
    одномерного массива типа int, который вводится с клавиатуры.
    Обрабатываются ошибки: ввод строки вместо числа, значение вне диапазона int,
    отсутствие положительных элементов. */

public class Task01_PositiveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = readInt(scanner);

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным.");
            }

            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = readInt(scanner);
            }

            int sum = 0;
            int count = 0;

            for (int value : array) {
                if (value > 0) {
                    sum += value;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalStateException("Положительные элементы отсутствуют.");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: нужно вводить только целые числа.");
            System.out.println("Подробности: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка типа данных: число выходит за диапазон типа int.");
            System.out.println("Подробности: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка аргумента: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Ошибка вычисления: " + e.getMessage());
        } finally {
            System.out.println("Работа программы завершена.");
        }
    }

    private static int readInt(Scanner scanner) {
        String input = scanner.next();

        if (!input.matches("-?\\d+")) {
            throw new NumberFormatException("введено не число: " + input);
        }

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new ArithmeticException("введенное число не помещается в диапазон int: " + input);
        }
    }
}
