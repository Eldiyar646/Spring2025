package _04_if_else_statements;

import java.util.Scanner;

import static java.lang.System.out;

public class Condition3 {
    public static void main(String[] args) {

//        int time = 6;
//        if (time >= 6 && time <= 18) {
//            out.println("Day");
//        }
//        if (time >= 19 && time <= 24) {
//            out.println("Night");
//        }
//        if (time >= 1 && time <= 5) {
//            out.println("Tonight");
//        } else {
//            out.println("You can enter: 1-24");
//        }

        // else -> optional (можно использовать и НЕ использовать)

        Scanner s = new Scanner(System.in);

        out.print("Citizen: ");
        String citizen = s.nextLine();
        if (citizen.equals("KG")) {
            out.print("Age: ");
            int age = s.nextInt();
            if (age >= 16) {
                out.println("You can get a passport");
            } else {
                out.println("Your under age");
            }
        } else {
            out.println("You are not citizen of KG");
        }
// ==============================================================

        Scanner scan = new Scanner(System.in);

        double age = 18, weight = 50;

        out.print("Введите свой возраст: ");
        age = scan.nextDouble();

        out.print("Введите свой вес: ");
        weight = scan.nextDouble();

        if (age >= 18) {
            if (weight >= 50) {
                out.println("Да, вы старше 18 лет. Вы имеете право сдавать кровь.");
            } else {
                out.println("Вы не можете сдать кровь, ваш вес меньше 50 кг.");
            }
        } else {
            out.println("Вы должны быть старше 18 лет.");
        }

// ==============================================================


        out.print("Введите свой возраст: ");
        age = new Scanner(System.in).nextDouble();
        if (age >= 18) {
            out.println("Вам уже 18 лет.");

            out.print("Введите свой вес: ");
            weight = new Scanner(System.in).nextDouble();
            if (weight >= 50) {
                out.println("Вы можете сдать кровь.");
            }
            if (weight < 50) {
                out.println("Ваш вес ниже 50 кг. Вы не можете быть донором.");
            }
        } else {
            out.println("Вам нет еще 18 лет.");
        }

// ==============================================================

        out.print("Введите свой возраст: ");
        age = new Scanner(System.in).nextDouble();
        String answer = (age >= 18) ? "Вам уже 18 лет!" : "Вам нет еще 18 лет!";
        System.out.println(answer);

        out.print("Введите свой вес: ");
        weight = new Scanner(System.in).nextDouble();
        String answer1 = (weight >= 50) ? "Вы можете сдать кровь." : "Ваш вес ниже 50 кг. Вы не можете cдать кровь.";
        System.out.println(answer1);
    }
}
