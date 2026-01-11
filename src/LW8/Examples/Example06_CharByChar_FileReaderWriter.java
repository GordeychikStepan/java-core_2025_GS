package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example06_CharByChar_FileReaderWriter {

    public static void main(String[] args) {
        File src = IoPaths.file("example6_in.txt").toFile();
        File dst = IoPaths.file("example6_out.txt").toFile();

        // Подготовим источник
        try (Writer w = new OutputStreamWriter(new FileOutputStream(src), StandardCharsets.UTF_8)) {
            w.write("Пример 6: посимвольное копирование.\nСтрока 2.\n");
        } catch (IOException e) {
            System.out.println("Ошибка подготовки: " + e);
            return;
        }

        try (Reader in = new FileReader(src);
             Writer out = new FileWriter(dst, true)) { // append = true

            int ch;
            while ((ch = in.read()) != -1) {
                out.append((char) ch);
                System.out.print((char) ch);
            }
            System.out.println("\n--- конец ---");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        System.out.println("dst: " + dst.getAbsolutePath());
    }
}
