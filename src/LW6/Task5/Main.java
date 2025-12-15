package LW6.Task5;

/*  Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных чисел
    1^2 + 2^2 + 3^2 + ... + n^2. Число n передается аргументом методу. Для проверки результата
    можно использовать формулу 1^2 + 2^2 +3^2+…+n^2=(n+l) (2^n + 1)/6 */

public class Main {
    public static void main(String[] args) {

        int n = 10;

        long sumLoop = SquareSum.sumOfSquares(n);
        long sumFormula = SquareSum.sumByFormula(n);

        System.out.println("Сумма квадратов (цикл): " + sumLoop);
        System.out.println("Сумма квадратов (формула): " + sumFormula);
    }
}
