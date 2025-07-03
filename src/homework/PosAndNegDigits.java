package homework;

import java.util.Scanner;

public class PosAndNegDigits {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int inputNumber = new Scanner(System.in). nextInt();
        if (inputNumber > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
