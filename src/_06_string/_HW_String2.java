package _06_string;

import java.util.Scanner;

import static java.lang.System.out;

public class _HW_String2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        out.print("Введите вашу фамилию: ");
        String sureName = scanner.nextLine();

        sureName = sureName.substring(0, 1).toUpperCase().concat(sureName.substring(1).toLowerCase());

        if (sureName.endsWith("ов") || (sureName.endsWith("ев")) ||
                (sureName.endsWith("ин") || (sureName.endsWith("ый")) ||
                        (sureName.endsWith("ский") || (sureName.endsWith("цкий"))))) {
            out.println("Вы - Мужчина.");
        } else if
        (sureName.endsWith("ова") || (sureName.endsWith("ева")) ||
                        (sureName.endsWith("ина") || (sureName.endsWith("ая")) ||
                                (sureName.endsWith("ская") || (sureName.endsWith("цкая"))))) {
            out.println("Вы - Женщина.");
        } else {
            out.println("Пол не определен!");
        }
        out.println("Ваша фамилия: " + sureName);
    }
}



