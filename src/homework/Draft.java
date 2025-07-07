package homework;

import java.util.Scanner;

import static java.lang.System.out;

public class Draft {
    public static void main(String[] args) {
        inputName();

    }


    public static void inputName() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;

        do {
            out.print("Enter your name: ");
            String input = scanner.nextLine();
            out.println("Hello, " + input);
            out.println("\t\tRepeat? (yes/no)");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                out.println("Come back later");
                isContinue = false;
            }
        } while (isContinue);
    }
}