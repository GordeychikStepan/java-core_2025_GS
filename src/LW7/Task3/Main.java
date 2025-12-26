package LW7.Task3;

/*  Напишите программу, в которой на основе суперкласса создается подкласс, а на основе этого подкласса
    создается еще один подкласс (цепочка наследования из трех классов). В первом суперклассе есть открытое
    целочисленное поле, метод с одним параметром для присваивания значения полю и конструктор с одним параметром.
    Во втором классе появляется открытое символьное поле, метод с двумя параметрами для присваивания значения полям
    (перегрузка метода из суперкласса) и конструктор с двумя параметрами. В третьем классе появляется открытое
    текстовое ноле, метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса)
    и конструктор с тремя параметрами. Для каждого класса определите метод toString () так, чтобы он возвращал
    строку с названием класса и значениями всех полей объекта. */

public class Main {
    public static void main(String[] args) {

        FirstClass a = new FirstClass(10);
        System.out.println(a);
        System.out.println();

        SecondClass b = new SecondClass(20, 'B');
        System.out.println(b);
        System.out.println();

        ThirdClass c = new ThirdClass(30, 'C', "Hello");
        System.out.println(c);
        System.out.println();

        // проверим перегруженные setValue(...)
        a.setValue(111);
        b.setValue(222, 'X');
        c.setValue(333, 'Z', "Stepan");

        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();
        System.out.println(c);
    }
}
