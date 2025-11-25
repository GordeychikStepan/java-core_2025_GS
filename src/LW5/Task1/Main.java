package LW5.Task1;

/*  Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
    Один из методов позволяет присвоить значение полю. Еще один метод при вызове возвращает результатом код символа.
    Третий метод позволяет вывести в консольное окно символ (значение поля) и его код. */

public class Main {
    public static void main(String[] args) {
        SymbolClass obj = new SymbolClass();

        obj.setSymbol('A');
        obj.printSymbolInfo();

        int code = obj.getSymbolCode();
        System.out.println("Полученный код: " + code);
    }
}
