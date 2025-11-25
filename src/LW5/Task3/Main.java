package LW5.Task3;

/*  Напишите программу с классом, у которого есть два целочисленных поля.
    В классе должны быть описаны конструкторы, позволяющие создавать объекты
    без передачи аргументов, с передачей одного аргумента и с передачей двух аргументов. */

public class Main {
    public static void main(String[] args) {
        NumberPair n1 = new NumberPair();
        NumberPair n2 = new NumberPair(5);
        NumberPair n3 = new NumberPair(7, 10);

        n1.printValues();  // a = 0, b = 0
        n2.printValues();  // a = 5, b = 0
        n3.printValues();  // a = 7, b = 10
    }
}
