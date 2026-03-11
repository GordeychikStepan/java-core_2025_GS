package LW9.Tasks;

/*  Разработать проект, в котором для ввода, вывода и изменения односвязного линейного списка создать следующие методы:
а)  с использованием цикла:
    •	ввод с головы createHead();
    •	ввод с хвоста createTail();
    •	вывод (возвращается строка, сформированная из элементов списка) toString();
    •	добавление элемента в начало списка AddFirst();
    •	добавление элемента в конец списка AddLast();
    •	вставка элемента в список с указанным номером Insert();
    •	удаление элемента с головы списка RemoveFirst();
    •	удаление последнего элемента списка RemoveLast();
    •	удаление из списка элемента с указанным номером Remove();
б)  с использованием рекурсии:
    •	ввод с головы createHeadRec();
    •	ввод с хвоста createTailRec();
    •	вывод (возвращается строка, сформированная из элементов списка) toStringRec(). */

public class Task08_Main {

    public static void main(String[] args) {
        Task08_LinkedList list = new Task08_LinkedList();

        int[] data = {1, 2, 3, 4, 5};

        System.out.println("Создание списка с головы:");
        list.createHead(data);
        System.out.println(list);

        System.out.println("\nСоздание списка с хвоста:");
        list.createTail(data);
        System.out.println(list);

        System.out.println("\nДобавление в начало:");
        list.AddFirst(100);
        System.out.println(list);

        System.out.println("\nДобавление в конец:");
        list.AddLast(200);
        System.out.println(list);

        System.out.println("\nВставка по индексу 3:");
        list.Insert(3, 999);
        System.out.println(list);

        System.out.println("\nУдаление первого элемента:");
        list.RemoveFirst();
        System.out.println(list);

        System.out.println("\nУдаление последнего элемента:");
        list.RemoveLast();
        System.out.println(list);

        System.out.println("\nУдаление элемента по индексу 2:");
        list.Remove(2);
        System.out.println(list);

        System.out.println("\nРекурсивное создание с головы:");
        list.createHeadRec(data);
        System.out.println(list.toStringRec());

        System.out.println("\nРекурсивное создание с хвоста:");
        list.createTailRec(data);
        System.out.println(list.toStringRec());
    }
}