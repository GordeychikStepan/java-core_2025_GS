package LW4;

import java.util.Scanner;

/*  10* (дополнительная задача). Напишите программу «Шифр Цезаря»,
    в которой необходимо реализовать собственный алфавит, остальные условия идентичны задаче 8. */

public class Task10 {

    // Собственный алфавит
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 .,!?()";

    // Метод шифрования строки по собственному алфавиту
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            int index = ALPHABET.indexOf(ch);

            if (index != -1) {
                // Сдвигаем по алфавиту
                int newIndex = (index + shift) % ALPHABET.length();
                if (newIndex < 0) newIndex += ALPHABET.length();

                result.append(ALPHABET.charAt(newIndex));
            } else {
                // Если символ не найден в алфавите — оставляем как есть
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Метод расшифровки
    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encrypted = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        while (true) {
            System.out.print("Выполнить обратное преобразование? (y/n): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                String decrypted = decrypt(encrypted, key);
                System.out.println("Обратное преобразование: " + decrypted);
                System.out.println("До свидания!");
                break;

            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;

            } else {
                System.out.println("Введите корректный ответ!");
            }
        }

        scanner.close();
    }
}
