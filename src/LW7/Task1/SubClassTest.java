package LW7.Task1;

public class SubClassTest extends SuperClassTest {

    // дополнительные приватные текстовые поля
    private String str2;
    private String str3;

    // конструктор с одним параметром
    public SubClassTest(String str1) {
        super(str1);
    }

    // конструктор с двумя параметрами
    public SubClassTest(String str2, String str3) {
        this.str2 = str2;
        this.str3 = str3;
    }

    // геттеры и сеттеры
    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    // переопределённый toString()
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1 = " + getStr1() + "\n" +
                "str2 = " + str2 + "\n" +
                "str3 = " + str3;
    }
}
