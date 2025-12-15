package LW6.Task2;

/*  Напишите программу с классом, в котором есть закрытое статическое целочисленное поле
    с начальным нулевым значением. В классе должен быть описан статический метод,
    при вызове которого отображается текущее значение статического поля,
    после чего значение поля увеличивается на единицу. */

public class Main {
    public static void main(String[] args) {

        Counter.showAndIncrement(); // 0
        Counter.showAndIncrement(); // 1
        Counter.showAndIncrement(); // 2
    }
}
