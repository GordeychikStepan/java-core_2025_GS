package LW7.Task1;

/*  Напишите программу, в которой есть суперкласс с приватным текстовым полем, конструктором с текстовым параметром
    и где переопределен метод toString (). На основе суперкласса путем наследования создается подкласс.
    У него появляется еще одно приватное текстовое ноле. Также подкласс должен иметь версии конструктора
    с одним и двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
    В обоих классах метод toString () переопределяется так, что он возвращает строку
    с названием класса и значение текстового поля или текстовых полей. */

public class Main {
    public static void main(String[] args) {

        SuperClassTest superObj = new SuperClassTest("Передано в суперкласс");
        System.out.println(superObj);
        System.out.println();

        SubClassTest subObj1 = new SubClassTest("Передано в подкласс");
        System.out.println(subObj1);
        System.out.println();

        SubClassTest subObj2 = new SubClassTest("Второе поле", "Третье поле");
        System.out.println(subObj2);
    }
}
