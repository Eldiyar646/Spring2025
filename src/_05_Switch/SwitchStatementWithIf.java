package _05_Switch;

import java.util.Scanner;

import static java.lang.System.out;

public class SwitchStatementWithIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double basePriceBus = 17, basePriceTrain = 50, basePriceMetro = 70;
        double price = 0;

        while (true) {
            out.print("Введите тип транспорта (bus/train/metro): ");
            String transport = scanner.nextLine();

            if (transport.equals("bus") || transport.equals("train") || transport.equals("metro")) {
            } else {
                out.println("Ошибка: неверный тип транспорта.");
                continue;
            }

            out.print("Введите ваш возраст: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            switch (transport) {
                case "bus":
                    if (age < 7) {
                        out.println("Проезд бесплатный!");

                    } else if (age >= 7 && age <= 18) {
                        price = basePriceBus * 0.5;
                    } else if (age >= 60) {
                        price = basePriceBus * 0.7;
                    } else {
                        price = basePriceBus;
                    }
                    break;

                case "train":
                    if (age < 7) {
                        out.println("Проезд бесплатный!");
                    } else if (age >= 7 && age <= 18) {
                        price = basePriceTrain * 0.5;
                    } else if (age >= 60) {
                        price = basePriceTrain * 0.7;
                    } else {
                        price = basePriceTrain;
                    }
                    break;

                case "metro":
                    if (age < 7) {
                        out.println("Проезд бесплатный!");
                    } else if (age >= 7 && age <= 18) {
                        price = basePriceMetro * 0.5;
                    } else if (age >= 60) {
                        price = basePriceMetro * 0.7;
                    } else {
                        price = basePriceMetro;
                    }
                    break;
            }

            if (price > 0) {
                out.println(String.format("Итоговая стоимость билета:  %s сом ", price));
            }
            break;
        }
    }
}
