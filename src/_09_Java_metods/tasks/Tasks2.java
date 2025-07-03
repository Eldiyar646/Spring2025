package _09_Java_metods.tasks;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {

//        check_odd_num();
//        System.out.println("***************");
//        check_even_num();
//        System.out.println(max_number(30, 50));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scan.nextInt();
        String result = period(age);
        System.out.println(result);
    }

    public static String period(int age) {
        String result = "";
        if (age >= 3 && age <= 7) {
            result = "det.sad";
        } else if (age >= 8 && age <= 17) {
            result = "shkola";
        } else if (age >= 18 && age <= 22) {
            result = "univer";
        } else if (age >= 23 && age <= 55) {
            result = "rabota";
        } else {
            result = "pensia";
        }
        return result;
    }

//    public static int max_number(int num1, int num2) {
//        if (num1 > num2) {
//            return num1;
//        } else {
//            return num2;
//        }
//    }
//
//    public static void check_odd_num() {
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 != 0) System.out.println("Это число нечетное " + i);
//        }
//    }
//
//    public static void check_even_num() {
//        for (int i = 2; i <= 20; i++) {
//            if (i % 2 == 0) System.out.println("Это число четное " + i);
//        }
//    }

    }