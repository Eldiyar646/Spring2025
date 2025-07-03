package _09_Java_metods.tasks;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста введите дату рождения");
        int date = scan.nextInt();
        dateOB();
        if (date >= 1 && date <= 31) {
            System.out.println(date);
            System.out.println("Пожалуйста введите месяц рождения");
            int month = scan.nextInt();
            monthOB();
            if (month >= 1 && month <= 12) {
                System.out.println(month);
                System.out.println("Пожалуйста введите год рождения");
                int year = scan.nextInt();
                yearOB();
                if (year >= 1980 && year <= 2020) {
                    System.out.println(year);
                } else {
                    System.out.println("YEAR: 1980-2020");
                }
            } else {
                System.out.println("MONTH: 1-12");
            }
        } else {
            System.out.println("DATE: 1-31");
        }
    }

    public static String dateOB() {
        int date = 0;
        if (date >= 1 && date <= 31) {
            String date_num_convert_to_string = String.valueOf(date);
            return date_num_convert_to_string;
        } else {
            return "Пожалуйста введите числа 1-31";
        }
    }

    public static String monthOB() {
        int month = 0;
        String zero = "0";
        String num_convert_to_string = String.valueOf(month); // zero = zero + month_number zero = "0" + "8" zero="08"
        if (month >= 1 && month <= 9) {
            zero += month;
            return zero;
        } else if (month >= 10 && month <= 12) {
            return num_convert_to_string;
        } else {
            return "Please enter number from 1 to 12";
        }
    }

    public static String yearOB() {
        int year = 0;
        String year_num_convert_to_string = String.valueOf(year);
        return year_num_convert_to_string;
    }
}