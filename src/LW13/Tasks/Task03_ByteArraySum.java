package LW13.Tasks;

import java.util.Scanner;

/*  Программа вычисляет сумму элементов одномерного массива типа byte,
    вводимого с клавиатуры. Обрабатываются ошибки: ввод строки вместо числа,
    ввод значения за границами byte и переполнение результата суммы. */

public class Task03_ByteArraySum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = readInt(scanner);

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }

            byte[] numbers = new byte[size];
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Введите элемент " + (i + 1) + " типа byte: ");
                numbers[i] = readByte(scanner);
            }

            byte result = calculateByteSum(numbers);
            System.out.println("Сумма элементов массива: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: нужно вводить целые числа.");
            System.out.println("Подробности: " + e.getMessage());
        } catch (ByteRangeException e) {
            System.out.println("Ошибка диапазона byte: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка вычисления: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        } finally {
            System.out.println("Работа программы завершена.");
        }
    }

    private static int readInt(Scanner scanner) {
        String token = scanner.next();

        try {
            return Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("введено не байтовое число: " + token);
        }
    }

    private static byte readByte(Scanner scanner) throws ByteRangeException {
        int value = readInt(scanner);

        if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
            throw new ByteRangeException(
                    "значение " + value + " выходит за границы byte от "
                            + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        }

        return (byte) value;
    }

    private static byte calculateByteSum(byte[] numbers) {
        int sum = 0;

        for (byte number : numbers) {
            sum += number;
            if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                throw new ArithmeticException(
                        "результат суммы вышел за границы типа byte: " + sum);
            }
        }

        return (byte) sum;
    }

    private static class ByteRangeException extends Exception {
        public ByteRangeException(String message) {
            super(message);
        }
    }
}
