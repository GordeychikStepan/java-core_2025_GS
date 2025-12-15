package LW6.Task2;

public class Counter {

    // закрытое статическое целочисленное поле
    private static int value = 0;

    // статический метод
    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + value);
        value++;
    }
}
