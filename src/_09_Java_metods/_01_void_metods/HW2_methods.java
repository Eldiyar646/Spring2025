package _09_Java_metods._01_void_metods;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class HW2_methods {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            quarter();
        }
    }

    public static void quarter() {

        out.print("Введите число: ");
        int num = new Scanner(in).nextInt();

        if (num == 1) {
            out.println("1й квартал");
        } else if (num == 2) {
            out.println("2й квартал");
        } else if (num == 3) {
            out.println("3й квартал");
        } else if (num == 4) {
            out.println("4й квартал");
        } else {
            out.println("В году есть только 4 квартала");
        }
    }
}


