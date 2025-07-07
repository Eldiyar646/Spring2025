package _10_Loops.WhileLoop;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Task1 {

    public static void main(String[] args) {

        number();
        checkNumber();

    }

    public static boolean number() {
        Scanner scan = new Scanner(System.in);
        int randomNumber = new Random().nextInt(10);
        int attempt = 3;
        while (attempt > 0) {
            out.println("Введите число от 1 до 10: ");
            int inputNumber = scan.nextInt();
            if (randomNumber == inputNumber) {
                out.println("Правильно!");
                return true;
            } else {
                attempt--;
                out.println("Попробуйте еще раз!");
                out.println("Осталось попыток " + attempt);
            }
        }
        return false;
    }


    public static boolean checkNumber() {
        int attempt = 3;
        Scanner scan = new Scanner(System.in);

        while (attempt > 0) {
            System.out.print("Введите число больше 1: ");
            int inputNumber = scan.nextInt();


            if (inputNumber >= 2) {
                int i = 2;
                while(i <= inputNumber) {
                    if (inputNumber % i == 0) {
                        System.out.println("Наименьший делитель числа " + inputNumber + " это " + i);
                        return true;
                    }
                    i++;
                }
            } else {
                attempt--;
                System.out.println("Число должно быть больше 1. Осталось попыток: " + attempt);
            }
        }
        return false;
    }
}