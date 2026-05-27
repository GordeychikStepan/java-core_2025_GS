package LW13.Examples;

public class Example7 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("0");
                throw new NullPointerException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
                throw new ArithmeticException("новая ошибка из блока catch");
            } catch (ArithmeticException e) {
                System.out.println("2");
            }

            System.out.println("3");
        } catch (ArithmeticException e) {
            System.out.println("Исключение обработано внешним catch: " + e);
        }
    }
}
