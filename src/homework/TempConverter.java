package homework;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        System.out.println("\t\t\tКонвертер температуры: ");

        double a = 1.8;
        double b = 32;

        System.out.println("Введите градусы в цельсиях: ");
        double celcius = new Scanner(System.in).nextDouble();

        double res = celcius * a + b;

        System.out.println("Температура в фаренгейтах: " + res);
    }
}
