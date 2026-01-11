package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Example05_UTFStrings_DataStreams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Path f = IoPaths.file("example5_utf.bin");
        System.out.println("Файл: " + f.toAbsolutePath());

        System.out.print("Введите количество строк для записи => ");
        int n = Integer.parseInt(sc.nextLine().trim());

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(f.toFile()))) {
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку => ");
                String s = sc.nextLine();
                out.writeUTF(s);
            }
            out.flush();
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e);
            return;
        }

        System.out.println("\nЧтение из файла:");
        try (DataInputStream in = new DataInputStream(new FileInputStream(f.toFile()))) {
            while (true) {
                try {
                    System.out.println(in.readUTF());
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e);
        }
    }
}
