package _10_Loops.do_while_loop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
password();
    }

    public static void password (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password:");
        String input = scan.nextLine();

        boolean isLowerCase = false;
        boolean isSpecial = false;
        boolean isDigit = false;

        String specialChars = "!@#$%^&*";

        if (input.length() < 8) {
            System.out.println("Пароль короче чем нужно");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(Character.isDigit(c)) {
                isDigit = true;
            }
            if(Character.isLowerCase(c)) {
                isLowerCase = true;
            }
            if(specialChars.contains(String.valueOf(c))) {
                isSpecial = true;
            }
        }
        if (isDigit && isLowerCase && isSpecial) {
            System.out.println("Пароль надёжный!");
        } else {
            System.out.println("Пароль должен содержать:");
            if (!isDigit) System.out.println("- хотя бы одну цифру");
            if (!isLowerCase) System.out.println("- хотя бы одну заглавную букву");
            if (!isSpecial) System.out.println("- хотя бы один спецсимвол: " + specialChars);
        }
    }
}

