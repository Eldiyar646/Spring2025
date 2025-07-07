package homework;

import java.util.Scanner;

import static java.lang.System.out;

public class HW3_Methods {

    static int attempt = 3;
    static int attemptPassword = 0;

    public static void main(String[] args) {

        out.println("\n*** Программа для входа в систему ***");
        out.println("\t** Заполните следующие поля **\n");

        if (login())
            password();
    }

    private static boolean login() {
        Scanner scan = new Scanner(System.in);
        while (attempt > 0) {
            out.print("Введите логин: ");
            String input = scan.nextLine();

            String login = "Eld";

            if (input.equals(login)) {
                return true;
            } else {
                attempt--;
                out.println("Не существует такого логина!");
                out.println("Попытайтесь еще раз!");
                out.println(attempt);
            }
        }
        return false;
    }

    private static void password() {
        Scanner scan = new Scanner(System.in);
        while (attemptPassword < 3) {
            out.print("Введите пароль: ");
            String input = scan.nextLine();

            String password = "12345";

            if (input.equals(password)) {
                out.println("Добро пожаловать!");
                break;
            } else {
                attemptPassword++;
                out.println("Неверный пароль!");

            }
        }
        out.println("Повторите попытку позже!");
    }
}