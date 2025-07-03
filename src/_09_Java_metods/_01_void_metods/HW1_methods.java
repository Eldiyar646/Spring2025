package _09_Java_metods._01_void_metods;

//Вывод квартала (Решить задачу только через метод!!!)
//Если пользователь введёт 1, то вывести Первый квартал
//Если пользователь введёт 2, то вывести Второй квартал
//Если пользователь введёт 3, то вывести Третий квартал
//Если пользователь введёт 4, то вывести Четвёртый квартал
//Иначе вывести «В году есть 4 квартала»
//Это задание выполнить в двух вариантах: 1)Switch 2)if else

import java.util.Scanner;

import static java.lang.System.out;

public class HW1_methods {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            quarter();
        }
    }

    public static void quarter() {

        out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();

        String quarter;

        switch (num) {
            case 1:
                quarter = "1й квартал";
                break;
            case 2:
                quarter = "2й квартал";
                break;
            case 3:
                quarter = "3й квартал";
                break;
            case 4:
                quarter = "4й квартал";
                break;
            default:
                quarter = "В году есть только 4 квартала";
                break;
        }
        out.println(quarter);
    }
}
