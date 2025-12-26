package LW7.Task4;

/*  Напишите программу, в которой использована цепочка наследования из трех классов. В первом классе есть
    открытое символьное поле. Во втором классе появляется открытое текстовое поле. В третьем классе появляется
    открытое целочисленное поле. В каждом из классов должен быть конструктор, позволяющий создавать объект
    на основе значений полей, переданных аргументами конструктору, а также конструктор создания копии. */

public class Main {
    public static void main(String[] args) {

        ThirdClass obj1 = new ThirdClass('A', "Java", 10);
        ThirdClass obj2 = new ThirdClass(obj1); // копия

        System.out.println("obj1: ch=" + obj1.ch +
                ", text=" + obj1.text +
                ", number=" + obj1.number);

        System.out.println("obj2: ch=" + obj2.ch +
                ", text=" + obj2.text +
                ", number=" + obj2.number);
    }
}
