package _16_OOP._14_Passport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPassport {
    public static void main(String[] args) {

        List<Passport> passportList = new ArrayList<>();

        Passport p1 = new Passport("Арунова Айзат", "2222638", "Кыргыз");
        Passport p2 = new Passport("Ермекова Ерке", "0326587", "Казах");
        Passport p3 = new Passport("Иванов Иван", "3696854", "Русский");
        passportList.add(p1);
        passportList.add(p2);
        passportList.add(p3);

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите ID для поиска: ");
        String inputNumber = scn.next();

        Passport found = Passport.search(passportList, inputNumber);
        if (found != null) {
            System.out.println("Найден " + found);
        } else {
            System.out.println("Пасспорт не найден");
        }
    }
}