package LW6.Task4;

/*  Напишите программу, в которой описан статический метод для вычисления двойного факториала числа,
    переданного аргументом методу. По определению, двойной факториал числа п (обозначается как n!!)
    — это произведение через одно всех чисел, не больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ...
    (последний множитель равен 1 для нечетного п и равен 2 для четного n).
    Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15. */

public class Main {
    public static void main(String[] args) {

        System.out.println("6!! = " + DoubleFactorial.calc(6)); // 48
        System.out.println("5!! = " + DoubleFactorial.calc(5)); // 15
        System.out.println("0!! = " + DoubleFactorial.calc(0)); // 1
        System.out.println("1!! = " + DoubleFactorial.calc(1)); // 1
    }
}
