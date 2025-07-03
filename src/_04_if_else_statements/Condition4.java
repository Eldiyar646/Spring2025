package _04_if_else_statements;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Condition4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        String bek = "Bek", sam = "Sam", abi = "Abi";

        int pass1 = 1, pass2 = 2, pass3 = 3;

        out.println("1. Ввойти в систему\n2. Регистрация");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            out.print("Введите логин: ");
            String name = input.nextLine();

            out.print("Введите пароль: ");
            int password = input.nextInt();

            if ((name.equals(bek) && password == pass1) ||
                    (name.equals(sam) && password == pass2) ||
                    (name.equals(abi) && password == pass3)) {
                out.println("Добро пожаловать, " + name + ".");
            } else {
                out.println("Неверный логин или пароль!");
            }

        } else if (choice == 2) {

            for (int i = 0; i <= 1; i++) {
                out.print("Введите новый логин: ");
                String newName = input.nextLine();

                if (newName.equals(bek) || newName.equals(sam) || newName.equals(abi)) {
                    out.println("Такой логин уже существует. Попробуйте снова.");

                } else {
                    out.print("Создайте новый пароль: ");
                    int newPassword = input.nextInt();
                    input.nextLine();

                    out.print("Повторите пароль: ");
                    int rePassword = input.nextInt();
                    input.nextLine();

                    if (newPassword == rePassword) {
                        out.println("Поздравляем аккаунт создан.");

                        out.print("Введите логин: ");
                        String name = input.nextLine();
                        out.print("Введите пароль: ");
                        int password = input.nextInt();

                        if ((name.equals(newName) && password == newPassword)) {
                            out.println("Добро пожаловать, " + name + ".");
                        } else {
                            out.println("Неверный логин или пароль!");
                        }
                    } else {
                        out.println("Пароль не совпадает. Ошибка регистрации.");
                    }
                }
            }
        } else {
            out.println("Ошибка. Обновите страницу.");
        }
    }
}