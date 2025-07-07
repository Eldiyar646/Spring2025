package _09_Java_metods.tasks;

import java.util.Scanner;

public class Task1 {

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        printArray();

        numbers[2] = inputNumber();

        printArray();

        printReversedArray();

    }

    private static void printArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static int inputNumber() {
        System.out.print("Enter you number: ");
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    private static void printReversedArray() {
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.println(numbers[i]);
        }
    }

}