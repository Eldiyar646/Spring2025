package _09_Java_metods._01_void_metods;

public class Calculator {
    public static void main(String[] args) {

        Calculator.deduction();
//        System.out.println(mmm.


        sum();
        deduction();
    }

    public static void sum() {
        int num1 = 50, num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void deduction() {
        int num1 = 30, num2 = 20;
        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else {
            System.out.println("У вас первое число меньше второй");
        }
    }
}