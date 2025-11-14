package LW4;

import java.util.Scanner;

/*  8.	Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
    Используете кодовую таблицу символов. При запуске программы в консоль необходимо вывести сообщение:
    «Введите текст для шифрования», после ввода текста, появляется сообщение: «Введите ключ».
    После того как введены все данные, необходимо вывести преобразованную строку с сообщением
    «Текст после преобразования: ». Далее необходимо задать вопрос пользователю:
    «Выполнить обратное преобразование? (y/n)», если пользователь вводит «y»,
    тогда выполнить обратное преобразование. Если пользователь вводит «n»,
    тогда программа выводит сообщение «До свидания!». Если пользователь вводит что-то другое,
    отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ». */

public class Task8 {

    // Метод шифрования строки (сдвиг кодов символов на shift)
    public static String getEncryptString(String encryptString, int shift) {

        char[] arrayChar = encryptString.toCharArray();   // строка -> массив символов
        long[] arrayInt = new long[arrayChar.length];     // массив кодов символов
        char[] arrayCharNew = new char[arrayChar.length]; // массив для результата

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i];       // получаем код символа
            arrayInt[i] = arrayInt[i] + shift; // сдвиг
            arrayCharNew[i] = (char) arrayInt[i]; // обратно в символ
        }

        encryptString = new String(arrayCharNew); // массив символов -> строка
        return encryptString;
    }

    // Обратное преобразование (расшифровка) – сдвиг в другую сторону
    public static String getDecryptString(String decryptString, int shift) {
        return getEncryptString(decryptString, -shift);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encrypted = getEncryptString(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        while (true) {
            System.out.print("Выполнить обратное преобразование? (y/n): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                String decrypted = getDecryptString(encrypted, key);
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
