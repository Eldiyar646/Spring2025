package _09_Java_metods._02_return_methods;

import java.util.Scanner;

import static java.lang.System.out;

public class HW_Pin {
    public static void main(String[] args) {

        String fullName = inputfullName();
        String dateOB = inputDateOfBirth();
        String personID = inputPin();

        if (personID.length() == 14) {
            if (personID.contains(dateOB.replace(".", "")))
                out.println(fullName.concat(", ваша анкета принята!"));
        } else {
            out.println(fullName.concat(", вам необходимо ввести верный ПИН"));
        }
    }

    private static String inputfullName() {
        out.print("Введите полное имя: ");
        return new Scanner(System.in).nextLine();
    }

    private static String inputDateOfBirth() {
        out.print("Введите дату рождения (ДД.MM.ГГГГ): ");
        return new Scanner(System.in).nextLine();
    }

    private static String inputPin() {
        out.print("Введите ПИН (14 символов): ");
        return new Scanner(System.in).nextLine();
    }
}