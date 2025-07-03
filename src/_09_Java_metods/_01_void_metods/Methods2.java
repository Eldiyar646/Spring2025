package _09_Java_metods._01_void_metods;

import java.util.Scanner;

public class Methods2 {

    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {

        a = inputDouble();
        b = inputDouble();

        sum();
        multiply();
        diff();
        divide();
    }

    private static void divide() {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    private static void diff() {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    private static void multiply() {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    private static void sum() {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    private static double inputDouble() {
        System.out.println("Enter number: ");
        return new Scanner(System.in).nextDouble();
    }
}
