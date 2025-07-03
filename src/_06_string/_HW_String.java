package _06_string;

import java.util.Scanner;

import static java.lang.System.out;

public class _HW_String {
    public static void main(String[] args) {

//        Если пользователь введет свою фамилию и имя и там будет слово «уулу» вернуть мужчина-кыргыз , а если «кызы» вернуть женщина-кыргыз
//        Если в фамилии и имени будут окончания «ов» и «ев» вернуть мужчина-русский, а если «ова» и «ева» вернуть женщина-русская
//        Если в фамилии и имени не будут уулу, кызы, ов, ев, ова, ева то вернуть «не склоняется фамилия или другая национальность»
//        Для этого изучить дополнительные методы .contains() и endsWith()


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            out.print("Enter your fullName: ");
            String fullName = input.nextLine().trim();

            String[] words = fullName.split(" ");
            String lastName = words[0].toLowerCase();

            if (fullName.contains("уулу")) {
                out.println("мужчина-кыргыз");
            } else if (fullName.contains("кызы")) {
                out.println("женщина-кыргыз");
            } else if ((fullName.endsWith("ов") || (fullName.endsWith("ев"))) ||
                    (lastName.endsWith("ов") || (lastName.endsWith("ев")))) {
                out.println("мужчина-русский");
            } else if ((fullName.endsWith("ова") || (fullName.endsWith("ева"))) ||
                    (lastName.endsWith("ова") || (lastName.endsWith("ева")))) {
                out.println("женщина-русская");
            } else {
                out.println("фамилия не склоняется или другая национальность");
            }
        }
    }
}


//
//input.nextLine().trim()
//Считывает строку и убирает лишние пробелы.
//split(" ")
//Разделяет строку на массив слов.
//Например, "Петров Иван" → ["Петров", "Иван"].
//Берем только первое слово (words[0])
//Это фамилия.
//Проверяем фамилию, а не всю строку
//Теперь endsWith() проверяет именно фамилию, а не имя.