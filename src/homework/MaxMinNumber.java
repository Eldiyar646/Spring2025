package homework;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        System.out.println("Enter 1st number: ");
        int inputFirstNum = new Scanner(System.in).nextInt();
        System.out.println("Enter 2nd number: ");
        int inputSecondNum = new Scanner(System.in).nextInt();

        System.out.println("Sum of two integers: " + (inputFirstNum + inputSecondNum));
        System.out.println("Difference of two integers: " + (inputFirstNum - inputSecondNum));
        System.out.println("Product of two integers: " + (inputFirstNum * inputSecondNum));
        System.out.println("Average of two integers: " + (inputFirstNum + inputSecondNum) / 2);
        System.out.println("Distance of two integers: " + (inputFirstNum - inputSecondNum));
        System.out.println("Max integer: " + inputFirstNum);
        System.out.println("Min integer: " + inputSecondNum);

    }
}
