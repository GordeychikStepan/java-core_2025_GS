package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Example04_FloatsCopy_DataStreams {

    public static void main(String[] args) {
        Path dir = IoPaths.file("My");
        Path src = dir.resolve("numIsh.bin");
        Path dst = dir.resolve("numRez.bin");

        try {
            Files.createDirectories(dir);

            Scanner sc = new Scanner(System.in);
            System.out.print("Сколько вещественных чисел (float) записать в файл? ");
            int count = sc.nextInt();

            // Запись в numIsh.bin
            try (DataOutputStream out = new DataOutputStream(new FileOutputStream(src.toFile()))) {
                System.out.println("Введите " + count + " чисел:");
                for (int i = 0; i < count; i++) {
                    float x = sc.nextFloat();
                    out.writeFloat(x);
                }
                out.flush();
            }

            // Чтение и переписывание в numRez.bin
            try (DataInputStream in = new DataInputStream(new FileInputStream(src.toFile()));
                 DataOutputStream out2 = new DataOutputStream(new FileOutputStream(dst.toFile()))) {

                System.out.println("\nПереписываем и выводим:");
                while (true) {
                    try {
                        float x = in.readFloat();
                        out2.writeFloat(x);
                        System.out.println("float = " + x);
                    } catch (EOFException eof) {
                        break;
                    }
                }
                out2.flush();
            }

            System.out.println("\nГотово:");
            System.out.println("Исходный: " + src.toAbsolutePath());
            System.out.println("Результат: " + dst.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
