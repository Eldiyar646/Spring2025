package _09_Java_metods.tasks;

import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int input = scan.nextInt();

        System.out.println("Введите второечисло: ");
        int input2 = scan.nextInt();

        boolean isNum = numeros(input, input2);
        System.out.println(isNum);
    }

    public static boolean numeros(int num1, int num2) {

        if (num1 == 10 || num2 == 10 || num1 - num2 == 10) {
            return true;
        } else {
            return false;
        }
    }
}


