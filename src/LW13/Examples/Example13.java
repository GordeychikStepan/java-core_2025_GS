package LW13.Examples;

public class Example13 {
    public static void main(String[] args) {
        try {
            int length = args.length;
            System.out.println("размер массива = " + length);
            int result = 10 / length;
            System.out.println("результат деления = " + result);
            args[length + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}
