package LW13.Examples;

public class Example5 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("0");
                throw new RuntimeException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
            }

            System.out.println("2");
        } catch (RuntimeException e) {
            System.out.println("Исключение не было перехвачено внутренним catch: " + e);
        }
    }
}
