package LW13.Examples;

public class Example14 {
    public static void m(int x) throws ArithmeticException {
        int result = 10 / x;
        System.out.println("результат деления = " + result);
    }

    public static void main(String[] args) {
        try {
            int length = args.length;
            System.out.println("размер массива = " + length);
            m(length);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
