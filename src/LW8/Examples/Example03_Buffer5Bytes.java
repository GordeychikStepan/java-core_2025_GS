package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example03_Buffer5Bytes {

    public static void main(String[] args) {
        File f = IoPaths.file("example3_source.txt").toFile();

        // Запишем тестовый текст
        try (Writer w = new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.UTF_8)) {
            w.write("Буфер 5 байт. Проверка чтения.\nВторая строка.\n");
        } catch (IOException e) {
            System.out.println("Ошибка подготовки файла: " + e);
            return;
        }

        try (InputStream in = new FileInputStream(f)) {
            byte[] buf = new byte[5];
            int read;
            while ((read = in.read(buf)) != -1) {
                System.out.print(new String(buf, 0, read, StandardCharsets.UTF_8));
            }
            System.out.println("\n--- конец ---");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
