package _09_Java_metods.tasks;

import java.util.Scanner;

public class DeleteDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter digit: ");
        int num = input.nextInt();
        digits(num);
    }

    public static void digits(int num) {
        if (num % 6 == 0) {
            System.out.println("Делится на 6");
        } else if (num % 3 == 0) {
            System.out.println("Делится на 3");
        } else if (num % 2 == 0) {
            System.out.println("Делится на 2");
        } else {
            System.out.println();
        }
    }
}