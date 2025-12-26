package LW7.Task2;

/*  Напишите программу, в которой есть суперкласс с приватным текстовым полем. В базовом классе (суперклассе)
    должен быть метод для присваивания значения полю с текстовым параметром. Объект суперкласса создается
    передачей одного текстового аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки.
    На основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое (публичное)
    целочисленное поле. В классе должны быть такие версии метода для присваивания значений полям
    (используется переопределение и перегрузка метода из суперкласса): без параметров, с текстовым параметром,
    с целочисленным параметром, с текстовым и целочисленным параметром. У конструктора подкласса два параметра
    (целочисленный и текстовый). */

public class Main {
    public static void main(String[] args) {

        // объект суперкласса создаётся через конструктор с 1 текстовым аргументом
        SuperClassTest2 a = new SuperClassTest2("Hello");
        System.out.println("Super text = " + a.getText());
        System.out.println("Super length = " + a.getTextLength());
        System.out.println();

        // объект подкласса: (int, String)
        SubClassTest2 b = new SubClassTest2(10, "Java");
        System.out.println("Sub text = " + b.getText());
        System.out.println("Sub length = " + b.getTextLength());
        System.out.println("Sub number = " + b.number);
        System.out.println();

        // без параметров
        b.setValue();
        System.out.println("After setValue(): text=" + b.getText() + ", len=" + b.getTextLength() +
                ", number=" + b.number);

        // с текстом
        b.setValue("Stepan");
        System.out.println("After setValue(text): text=" + b.getText() + ", len=" + b.getTextLength() +
                ", number=" + b.number);

        // с числом
        b.setValue(777);
        System.out.println("After setValue(int): text=" + b.getText() + ", len=" + b.getTextLength() +
                ", number=" + b.number);

        // с текстом и числом
        b.setValue("Test", 5);
        System.out.println("After setValue(text,int): text=" + b.getText() + ", len=" + b.getTextLength() +
                ", number=" + b.number);
    }
}
