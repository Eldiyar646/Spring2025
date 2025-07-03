package _09_Java_metods._01_void_metods;

import java.util.Scanner;

public class Methods3 {

    static int time = 0;

    public static void main(String[] args) {

        time = getNumber();
        cook();
    }

    private static int getNumber() {
        System.out.print("Введите число: ");
        return new Scanner(System.in).nextInt();
    }

    public static void cook() {

        if (time >= 1 && time <= 24) {
            if (time >= 7 && time <= 10) {
                System.out.println("Завтра");
            } else if (time >= 12 && time <= 14) {
                System.out.println("Обед");
            } else if (time >= 17 && time <= 19) {
                System.out.println("Ужин");
            } else {
                System.out.println("НЕ ВРЕМЯ ДЛЯ ЕДЫ");
            }
        } else {
            System.out.println("Введите цифру в формате 24 часа");
        }
    }
}
