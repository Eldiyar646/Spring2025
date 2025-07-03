package _04_if_else_statements;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class Condition5 {
    public static void main(String[] args) {

        // Подсчет времени

        Scanner scanner = new Scanner(in);
//        int hour = input.nextInt();
//
//        if (hour >= 0 && hour <= 24) {
//            if (hour > 0 && hour <= 11) {
//                System.out.println("Morning");
//            } else if (hour >= 12 && hour <= 17) {
//                System.out.println("Day");
//            } else if (hour >= 18 && hour <= 20) {
//                System.out.println("Evening");
//            } else {
//                System.out.println("Night");
//            }
//        } else {
//            System.out.println("Invalid time");
//        }


        int bagPrice = 3000;
        int wallletPrice = 500;
        int baggagePrice = 3000;
        double money = 0.0;
        double priceWithDisount = 0;
        double change = 0;
        out.println("1. Bag - " + bagPrice
                + "\n" + "2. Wallet - " + wallletPrice
                + "\n" + "3.Baggage - " + baggagePrice);
        out.println("Please select item");
        String item = scanner.nextLine();
        if (item.equals("Bag")) {
            priceWithDisount = bagPrice - (bagPrice * 0.05);
            out.println("Sale 5% " + priceWithDisount);
            out.println("Your payment: ");
            money = scanner.nextDouble();
            if (money == priceWithDisount) {
                out.println("Thank you! Please take your bag");
            } else if (money > priceWithDisount) {
                change = money - priceWithDisount;
                System.out.println("Your change: " + change);
            } else if (bagPrice >= 2000) {
                priceWithDisount = bagPrice - (bagPrice * 0.10);
                System.out.println("Sale 10% " + priceWithDisount);
                money = scanner.nextDouble();
                if (money > priceWithDisount) {
                    change = money - priceWithDisount;
                    System.out.println("Your change: " + change);
                } else {
                    System.out.println("Not enough money");
                }
            }
        } else if (item.equals("Wallet")) {
                System.out.println("Your payment: ");
                money = scanner.nextDouble();
                if (money == wallletPrice) {
                    System.out.println("Thank you! Please take your wallet");
                } else if (money >= wallletPrice) {
                    change = money - wallletPrice;
                    System.out.println("Your change: " + change);
                } else {
                    System.out.println("Not enough money");
                }

            } else if (item.equals("Baggage")) {
                priceWithDisount = baggagePrice - (baggagePrice * 0.05);
                System.out.println("Sale 5% " + priceWithDisount);
                System.out.println("Your payment: ");
                money = scanner.nextDouble();
            if (money == priceWithDisount) {
                System.out.println("Thank you! Please take your baggage");
            } else if (money > priceWithDisount) {
                    change = money - priceWithDisount;
                    System.out.println("Your change: " + change);
                } else {
                    System.out.println("Not enough money");
                }
            } else {
                System.out.println("This item out of Stock");
            }
        }
    }

