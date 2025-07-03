package homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        System.out.println("\t*** Калькулятор ***\n");
        System.out.println("Введите первое число: ");
        double first = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число: ");
        double second = new Scanner(System.in).nextDouble();

        double res = 0;

//        double res = first + second;
//        double res2 = first - second;
//        double res3 = first * second;
//        double res4 = first / second;

//         System.out.println("Результат:" + "\n" + res + "\n" + res2 + "\n" + res3 + "\n" + res4);

        System.out.println("Что вы хотите сделать: ");
        String action = new Scanner(System.in).nextLine();

        switch (action) {
            case "+":
                res = first + second;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = first - second;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = first * second;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (second == 0)
                    System.out.println("Error");
                else {
                    res = first / second;
                    System.out.println("Результат: " + res);
                }
                break;
        }
    }
}
