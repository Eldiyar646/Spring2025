package _11_Arrays;

import java.util.Scanner;

import static java.lang.System.out;

public class Task3 {

    public static void main(String[] args) {

        numbers();
    }

    public static void numbers() {
        //               0  1  2  3  4  5  6  7
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        out.println("Введите число: ");
        int input = new Scanner(System.in).nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                out.println("Это число под " + i + " индексом.");
                return;
            }
        }
        out.println("Нет такого числа!");
    }
}