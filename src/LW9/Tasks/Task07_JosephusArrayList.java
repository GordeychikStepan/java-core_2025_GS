package LW9.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*  В кругу стоят N человек, пронумерованных от 1 до N.
    При ведении счета по кругу вычеркивается каждый второй человек,
    пока не останется один. Составить две программы, моделирующие процесс.
    Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
    Какая из двух программ работает быстрее? Почему? */

public class Task07_JosephusArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество человек N: ");
        int n = scanner.nextInt();

        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        long start = System.nanoTime();
        int survivor = solveJosephus(people);
        long end = System.nanoTime();

        System.out.println("Остался человек № " + survivor);
        System.out.println("Время выполнения ArrayList: " + (end - start) + " нс");
    }

    public static int solveJosephus(List<Integer> people) {
        int index = 0;

        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }
}