package LW8.Examples;

import LW8.IoPaths;

import java.io.File;

public class Example01_FileBasics {

    public static void main(String[] args) {
        try {
            // Файл в базовой папке
            File f1 = IoPaths.file("MyFile1.txt").toFile();
            boolean created1 = f1.createNewFile();
            System.out.println("MyFile1.txt created: " + created1);
            System.out.println("Exists: " + f1.exists());
            System.out.println("AbsolutePath: " + f1.getAbsolutePath());
            System.out.println("Name: " + f1.getName());
            System.out.println("Parent: " + f1.getParent());
            System.out.println("CanRead: " + f1.canRead());
            System.out.println("CanWrite: " + f1.canWrite());
            System.out.println("IsFile: " + f1.isFile());
            System.out.println("IsDirectory: " + f1.isDirectory());
            System.out.println();

            // Несколько вложенных папок
            File dirs = IoPaths.file("Papka1", "Papka2", "Papka3").toFile();
            boolean mk = dirs.mkdirs();
            System.out.println("Created nested dirs: " + mk);
            System.out.println("Dirs absolute: " + dirs.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }
}