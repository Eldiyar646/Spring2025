package _09_Java_metods._01_void_metods;

import java.util.Scanner;

public class Draft {

    public static void main(String[] args) {

        System.out.print("Заполните анкету " + "\n" + "Полное имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Дата рождения: ");
        String date = scanner.nextLine();
        System.out.print("ИНН: ");
        String inn = scanner.nextLine();
        Draft obj = new Draft();
        if (obj.isInnValid(inn)) {
            System.out.println("ИНН  состоит из 14 цифр, повторите попытку!");
        }
        if (obj.check_inn_birth(date, inn)) {
            System.out.println(name + " - Ваша анкета принята!" + "\n" + "До свидания и хорошего дня!");
        } else {
            System.out.println("Введите верный ИНН");
        }
    }

    public boolean isInnValid(String inn) {
        if (inn.length() != 14) {
            return true;
        }
        return false;
    }

    public String cleanDate(String date) {
        return date.replace(".", "");
    }

    public boolean check_inn_birth(String date, String inn) {
        String CheckDate = cleanDate(date);
        StringBuilder sb1 = new StringBuilder(inn);
        sb1.deleteCharAt(0);
        return sb1.toString().startsWith(CheckDate);
    }
}