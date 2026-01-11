package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Example02_ReadFrom3Sources_Bytes {

    private static void readAll(InputStream in) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            System.out.print((char) b);
        }
        System.out.println("\n--- конец ---\n");
    }

    public static void main(String[] args) {
        // Подготовим тестовый файл
        File f = IoPaths.file("example2_file.txt").toFile();
        try (Writer w = new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.UTF_8)) {
            w.write("Example02: файл-источник (UTF-8)\nСтрока 2\n");
        } catch (IOException e) {
            System.out.println("Не удалось создать тестовый файл: " + e);
            return;
        }

        try {
            System.out.println("=== 1) Из файла ===");
            try (InputStream inFile = new FileInputStream(f)) {
                readAll(inFile);
            }

            System.out.println("=== 2) Из URL (может не работать без интернета) ===");
            try (InputStream inUrl = new URL("https://example.com").openStream()) {
                readAll(inUrl);
            } catch (IOException e) {
                System.out.println("URL недоступен: " + e);
                System.out.println("--- конец ---\n");
            }

            System.out.println("=== 3) Из массива byte[] ===");
            byte[] arr = "ByteArrayInputStream demo: 5 8 3 9 11\n".getBytes(StandardCharsets.UTF_8);
            try (InputStream inArr = new ByteArrayInputStream(arr)) {
                readAll(inArr);
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
