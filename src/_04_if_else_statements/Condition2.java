package _04_if_else_statements;

import java.util.Scanner;
import static java.lang.System.out;

public class Condition2 {

    public static final String RESET = "\u001B[0m";
    public static final String PURPLE = "\u001B[35m";
    public static final String SMS = "Экзамен СДАН. Ваша оценка";

    public static void main(String[] args) {

// Please enter your points
// 49
// Экзамен сдан
// Ваша оценка - С


// 0 - 44 -> Экзамен НЕ сдан. Ваша оценка - С
// 45 - 100 -> Экзамен СДАН.
// D -> 0 - 44
// C -> 45 - 74
// B -> 75 - 89
// A -> 90 - 100

        int count = 5;
        for (int i = 0; i < count; i++) {

            Scanner points = new Scanner(System.in);
            out.println("Введите вашу оценку: ");
            double mark = points.nextDouble();

            if (mark >= 90 && mark <= 100) {
                out.println(PURPLE + SMS + " 'A'." + RESET);
                break;
            } else if (mark >= 75 && mark <= 89.9) {
                out.println(PURPLE + SMS + " 'B'." + RESET);
                break;
            } else if (mark >= 45 && mark <= 74.9) {
                out.println(PURPLE + SMS + " 'С'." + RESET);
                break;
            } else if (mark >= 0 && mark <= 44.9) {
                out.println(PURPLE + "Экзамен НЕ СДАН. Ваша оценка " + "'D'." + RESET);
                break;
            } else {
                out.println(PURPLE + "Попробуйте еще раз" + RESET);
            }
        }
    }
}
