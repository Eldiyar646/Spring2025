package _04_if_else_statements;

import java.util.Scanner;

import static java.lang.System.out;

public class Condition6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int price = 1500;

        double change = 0;


        out.print("Введите ваш возраст: ");
        int age = input.nextInt();

        out.print("Введите ваш вес: ");
        double weight = input.nextDouble();
        input.nextLine();

        if (age >= 18 && weight >= 50) {
            out.println("Вам разрешен прыжок с тарзанки!\n");

            out.print("Вы согласны на прыжок? (Да/Нет): ");
            String answer = input.nextLine().trim();

            boolean agree = answer.equalsIgnoreCase("да");

            if (agree) {
                out.print(String.format("Просим оплатить за прыжок %s сом!", price));
                out.println("");

                out.println("Внесите Денежные средства: ");
                int money = input.nextInt();
                if (money == price) {
                    out.println("Оплата прошла! Проходите!");
                } else if (money > price) {
                    change = money - price;
                    out.println("Оплата прошла! Проходите!");
                    out.println(String.format("Ваша сдача: %s сом.", change));
                } else {
                    out.println("У вас недостаточно средств.");
                }
            } else {
                System.out.println("Приходите в следующий раз.");
            }
        } else {
            out.println("Ваш возраст или вес не подходят!");
        }
        input.close();
    }
}

