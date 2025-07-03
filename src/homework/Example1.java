package homework;

public class Example1 {

    static int age = 3;

    String name;

    public static void main(String[] args) {
        System.out.println(Example1.getFirstChar("ELD"));

    }

    public static char getFirstChar(String value) {
        return value.charAt(0);
    }

    public char getCharByIndex(String value, int index) {
        age = index;
        return value.charAt(index);
    }

}
