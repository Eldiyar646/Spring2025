package _16_OOP._05_Candidates;

import java.util.Scanner;

import static java.lang.System.out;

public class CandidatesMain {
    public static void main(String[] args) {

        Candidates list = new Candidates();
        Scanner scn = new Scanner(System.in);

        out.print("Введите ваше имя: ");
        String name = scn.nextLine();

        out.print("Введите ваш возраст: ");
        int age = scn.nextInt();
        String ageResult = list.ageOfCandidates(age);
        out.println(ageResult);

        out.print("Введите ваш рост: ");
        double height = scn.nextDouble();
        scn.nextLine();
        String heightResult = list.heightOfCandidates(height);
        out.println(heightResult);

        out.print("Есть ли татуировки или шрамы на открытых местах? (Да/Нет): ");
        String tattooAnswer = scn.nextLine().trim();
        String tattooResult = list.tattoo(tattooAnswer);
        out.println(tattooResult);

        out.print("Высшее образование? (Да/Нет): ");
        String eduAnswer = scn.nextLine().trim();
        String eduResult = list.education(eduAnswer);
        out.println(eduResult);

        out.println("Ваш уровень английского:");
        out.println("1. Beginner, 2. Intermediate, 3. Advanced.");
        out.print("Выберите один: ");
        int englishAnswer = scn.nextInt();
        String langResult = list.languageSkills(englishAnswer);
        out.println(langResult);

        scn.close();
        out.println();

        if (ageResult.contains("Принято!") &&
                heightResult.contains("Принято!") &&
                tattooResult.contains("Принято!") &&
                eduResult.contains("Принято!") &&
                langResult.contains("Принято!")) {

            out.println(Candidates.YELLOW + "Поздравляем, " + name + "! Вы успешно приняты в команду Emirates." + Candidates.RESET);
        } else {
            System.err.println("К сожалению, " + name + ". Вы не прошли.");
        }
    }
}