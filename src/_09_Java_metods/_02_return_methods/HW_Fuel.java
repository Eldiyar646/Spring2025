package _09_Java_metods._02_return_methods;

import java.util.Scanner;

import static java.lang.System.out;

public class HW_Fuel {
    public static void main(String[] args) {

        int petrol = 50, diesel = 55, gas = 30;

        double change = 0;

        while (true) {
            out.println("Каким топливом Вы хотели бы заправиться? " +
                    "\n1. Бензин, литр 50 сом.\n2. Дизель, литр 55 сом.\n3. Газ, куб.м. 30 сом. ");
            int fuelType = new Scanner(System.in).nextInt();

            if (fuelType == 1) {
                int fuelCapacity = inputCapacity();
                if (fuelCapacity == 50 || fuelCapacity == 70 || fuelCapacity == 90) {
                    int fuelLiter = liter();
                    if (fuelLiter <= fuelCapacity) {
                        double sum = fuelLiter * petrol;
                        out.println(String.format(fuelLiter + " литров бензина будет %s cомов.", sum));
                        double pay = payMoney();
                        if (pay == sum) {
                            complete();
                            break;
                        } else if (pay > sum) {
                            change = pay - sum;
                            out.println(String.format("Оплата прошла. Ваша сдача: %s сом", change));
                            break;
                        } else {
                            noMoney();
                        }
                    } else {
                        noSpace();
                    }
                } else {
                    out.println("Нет такого объема!");
                }

            } else if (fuelType == 2) {
                int fuelCapacity = inputCapacity();
                if (fuelCapacity == 50 || fuelCapacity == 70 || fuelCapacity == 90) {
                    int fuelLiter = liter();
                    if (fuelLiter <= fuelCapacity) {
                        double sum = fuelLiter * diesel;
                        out.println(String.format(fuelLiter + " литров дизеля будет %s сомов.", sum));
                        double pay = payMoney();
                        if (pay == sum) {
                            complete();
                            break;
                        } else if (pay > sum) {
                            change = pay - sum;
                            out.println(String.format("Оплата прошла. Ваша сдача: %s сом", change));
                            break;
                        } else {
                            noMoney();
                        }
                    } else {
                        noSpace();
                    }
                } else {
                    out.println("Нет такого объема!");
                }

            } else if (fuelType == 3) {
                int fuelCapacity = inputCapacity();
                if (fuelCapacity == 50 || fuelCapacity == 70 || fuelCapacity == 90) {
                    int fuelLiter = liter();
                    if (fuelLiter <= fuelCapacity) {
                        double sum = fuelLiter * gas;
                        out.println(String.format(fuelLiter + " литров газа будет %s cомов.", sum));
                        double pay = payMoney();
                        if (pay == sum) {
                            complete();
                            break;
                        } else if (pay > sum) {
                            change = pay - sum;
                            out.println(String.format("Оплата прошла. Ваша сдача: %s сом", change));
                            break;
                        } else {
                            noMoney();
                        }
                    } else {
                        noSpace();
                    }
                } else {
                    out.println("Нет такого объема!");
                }
            }
        }
    }

    private static void noSpace() {
        out.println("В вашу машину столько топлива не поместиться!");
    }

    private static void noMoney() {
        out.println("Недостаточно средств!");
    }

    private static void complete() {
        out.println("Оплата прошла. Возьмите чек.");
    }

    private static double payMoney() {
        out.println("Прошу внести оплату в сомах: ");
        return new Scanner(System.in).nextDouble();
    }

    private static int liter() {
        out.println("На сколько литров вы хотите заправиться? Напишите ___ литров.");
        return new Scanner(System.in).nextInt();
    }

    private static int inputCapacity() {
        out.println("Какой у вас объем топливного бака? Выберите один из вариантов. " +
                "\nA. 50 литров.\nB. 70 литров.\nC. 90 литров.");
        return new Scanner(System.in).nextInt();
    }
}