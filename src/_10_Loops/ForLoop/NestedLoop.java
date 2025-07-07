package _10_Loops.ForLoop;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        login_password_attempts();
    }

    public static void login_password_attempts() {
        final String correct_login = "alex@gmail.com";
        final String correct_password = "qwerty123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter login: ");
        String user_login = scanner.next();
        System.out.println();

        // если ввести другой логин то он будет неравен != сохраненному заранее логину
        if (!user_login.equals(correct_login)) {
            System.out.println("Invalid login");

        } else {
            for (int attempt = 1; attempt <= 3; attempt++) {
                System.out.print("Please enter password: ");
                String user_password = scanner.next();
// если ввести неправильный пароль, он его сравнивает с заранее сохраненным паролем
//
                if (user_password.equals(correct_password)) {
                    System.out.println("Welcome");
                    return;
                } else {
                    System.out.println("Invalid password");
                    if (attempt <= 3) {
                        System.out.println("You have " + (attempt - 3) + " attempts left");
                    }
                }
            }
            System.out.println("Please try again later");

        }
    }
}