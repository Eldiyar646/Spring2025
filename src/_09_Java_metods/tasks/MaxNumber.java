package _09_Java_metods.tasks;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        max(num1, num2);
    }

    public static void max(int num1, int num2) {
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Наибольшее число: " + max);

    }
}


