package homework;

import java.util.Scanner;

public class CashConverter {
    public static void main(String[] args) {

        System.out.println("\t\t\tКонвертер валют: ");

        var dollar = 87.80;
        var euro = 91.83;

        System.out.println("Введите сумму в сомах: ");
        var som = new Scanner(System.in).nextDouble();
        var res = som / dollar;
        var res1 = som / euro;

        System.out.println("Ваша сумма: " + res + " долларов.");
        System.out.println("Ваша сумма: " + res1 + " евро.");
    }
}
