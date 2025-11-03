package LW3;

/*  Напишите программу, в которой создается одномерный
    символьный массив из 10 элементов. Массив заполняется буквами «через
    одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
    ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
    порядке. Размер массива задается переменной. */

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        char[] letters = new char[size];

        for (int i = 0; i < size; i++) {
            letters[i] = (char)('a' + i * 2);
        }

        System.out.print("Прямой порядок: ");
        for (int i = 0; i < size; i++) {
            System.out.print(letters[i] + " ");
        }

        System.out.print("\nОбратный порядок: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
