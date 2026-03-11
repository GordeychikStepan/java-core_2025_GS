package LW9.Variant5_CollectionsBenchmark;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/*  Вариант 5 — сравнение коллекций
    По методичке для варианта 5 нужны:
    ArrayDeque, ArrayList, SortedSet.
    Количество элементов: 5 * 1 000 000 = 5 000 000. */

public class Main {

    private static final int N = 5_000_000;

    public static void main(String[] args) {
        System.out.println("Количество элементов: " + N);
        System.out.println();

        benchmarkArrayList();
        benchmarkArrayDeque();
        benchmarkSortedSet();
    }

    private static void benchmarkArrayList() {
        System.out.println("=== ArrayList ===");

        ArrayList<Integer> list = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Добавление в конец: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        list.add(0, -1);
        end = System.currentTimeMillis();
        System.out.println("Добавление в начало: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        list.add(list.size() / 2, -2);
        end = System.currentTimeMillis();
        System.out.println("Добавление в середину: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        list.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Удаление из начала: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        list.remove(list.size() / 2);
        end = System.currentTimeMillis();
        System.out.println("Удаление из середины: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        list.remove(list.size() - 1);
        end = System.currentTimeMillis();
        System.out.println("Удаление с конца: " + (end - start) + " мс");

        int index = list.size() / 2;
        start = System.currentTimeMillis();
        int value = list.get(index);
        end = System.currentTimeMillis();
        System.out.println("Получение по индексу: " + (end - start) + " мс, значение = " + value);

        System.out.println();
    }

    private static void benchmarkArrayDeque() {
        System.out.println("=== ArrayDeque ===");

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            deque.addLast(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Добавление в конец: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        deque.addFirst(-1);
        end = System.currentTimeMillis();
        System.out.println("Добавление в начало: " + (end - start) + " мс");

        System.out.println("Добавление в середину: операция не поддерживается напрямую");

        start = System.currentTimeMillis();
        deque.removeFirst();
        end = System.currentTimeMillis();
        System.out.println("Удаление из начала: " + (end - start) + " мс");

        System.out.println("Удаление из середины: операция не поддерживается напрямую");

        start = System.currentTimeMillis();
        deque.removeLast();
        end = System.currentTimeMillis();
        System.out.println("Удаление с конца: " + (end - start) + " мс");

        System.out.println("Получение по индексу: операция не поддерживается");
        System.out.println();
    }

    private static void benchmarkSortedSet() {
        System.out.println("=== SortedSet (TreeSet) ===");

        SortedSet<Integer> set = new TreeSet<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Добавление элементов: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        set.add(-1);
        end = System.currentTimeMillis();
        System.out.println("Добавление элемента: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        set.remove(-1);
        end = System.currentTimeMillis();
        System.out.println("Удаление элемента: " + (end - start) + " мс");

        start = System.currentTimeMillis();
        boolean contains = set.contains(N / 2);
        end = System.currentTimeMillis();
        System.out.println("Поиск элемента: " + (end - start) + " мс, найден = " + contains);

        System.out.println("Добавление в начало/середину/конец: не поддерживается");
        System.out.println("Удаление из начала/середины/конца по индексу: не поддерживается");
        System.out.println("Получение по индексу: не поддерживается");
        System.out.println();
    }
}