package _09_Java_metods.tasks;

import java.util.Scanner;

public class sameNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        checkNumber(number);
    }

    public static void checkNumber(double number) {
        if (number >= 0) {
            if (number <= 10) {
                System.out.println("ОК");
            } else {
                System.out.println("Ошибка");
            }
        } else {
            System.out.println("Ошибка");
        }
    }
}

//        if (!(number < 0) & !(number > 10)) {
//            System.out.println("ОК");
//        } else {
//            System.out.println("Ошибка");
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        out.println("Введите число: ");
//        String input = scanner.nextLine();
//
//        String result = sameNumber(input);
//        out.println(result);
//    }
//
//    public static String sameNumber(String number) {
//
//        number = number.charAt(0) == number.charAt(1) && number.charAt(1) == number.charAt(2)
//                ? "Поздравляю!" : "Нет совпадений! Попробуйте еще раз!";
//        return number;
