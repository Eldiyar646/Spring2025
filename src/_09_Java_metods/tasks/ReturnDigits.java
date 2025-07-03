package _09_Java_metods.tasks;

import java.util.Scanner;

public class ReturnDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите любое число: ");
        String input = scanner.nextLine();
        number(input);
    }

    public static void number (String num) {
        if (num.length() == 1) {
            System.out.println("Однозначное число: " + num);
        } else {
            char lastChar = num.charAt(num.length() - 1);
            int number2 = lastChar - '0';

            if (number2 % 2 == 0) {
                System.out.println("Цифра чётная: " + number2);
            } else {
                System.out.println("Цифра нечётная: " + number2);
            }
        }
    }
}

