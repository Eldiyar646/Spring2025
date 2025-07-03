package _04_if_else_statements;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {

//        int num = 90;
//        num = 87;
//
//        int age = 25;
//
//        if (age > 18) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Children");
//        }

        Scanner scan = new Scanner(System.in);
//        int season = scan.nextInt();
//        if (season == 1) {
//            System.out.println("Winter");
//        } else if (season == 2) {
//            System.out.println("Spring");
//        } else if (season == 3) {
//            System.out.println("Summer");
//        } else if (season == 4) {
//            System.out.println("Autumn");
//        } else {
//            System.err.println("Error");
//        }

        // 1. if - else
        // 2. if  else ladder

        System.out.println("Введите дату рождения?");
        int dob = scan.nextInt();

        if (dob >= 1903 && dob <= 1923) {
            System.out.println("Heroes");
        } else if (dob >= 1924 && dob <= 1943) {
            System.out.println("Silent");
        } else if (dob >= 1944 && dob <= 1963) {
            System.out.println("Boomers");
        } else if (dob >= 1964 && dob <= 1984) {
            System.out.println("Busters");
        } else if (dob >= 1985 && dob <= 2002) {
            System.out.println("Millennium");
        } else if (dob >= 2003 && dob <= 2023) {
            System.out.println("Homelanders");
        } else {
            System.err.println("Error");
        }


    }
}

