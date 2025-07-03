package _06_string;

import java.util.Scanner;

import static java.lang.System.out;

public class _HW_String3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        out.print("Введите ваше имя: ");
        String firstName = scanner.nextLine();

        out.println("Ваше имя " + firstName.substring(0, 1).toUpperCase().concat(firstName.substring(1).toLowerCase()).concat("."));
    }
}
