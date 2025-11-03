package LW3;

/*  Напишите программу, в которой создается символьный массив из
    10 элементов. Массив заполнить большими (прописными) буквами
    английского алфавита. Буквы берутся подряд, но только согласные (то есть
    гласные буквы ’ А ' , ' Е ' и ' I ' при присваивании значений элементам массива
    нужно пропустить). Отобразите содержимое созданного массива в консольном
    окне. */

public class Task8 {
    public static void main(String[] args) {
        int size = 10;
        char[] letters = new char[size];

        char ch = 'A';
        int count = 0;

        while (count < size) {
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                letters[count] = ch;
                count++;
            }
            ch++;
        }

        System.out.print("Согласные буквы: ");
        for (char c : letters) {
            System.out.print(c + " ");
        }
    }
}
