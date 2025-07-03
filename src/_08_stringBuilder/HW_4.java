package _08_stringBuilder;

import java.util.Scanner;

import static java.lang.System.out;

//        1. Если имя начинается с буквы “А” и возраст меньше или равен 30,
//        вывести сообщение: “Привет, [имя]! Ты молодец
//        2. Если имя начинается с буквы “А” и возраст больше 30,
//        вывести сообщение: “Привет, [имя]! Ты молодец, но и мудрец уже!”
//        3. Если имя не начинается с буквы “А”, вывести сообщение: “Привет, [имя]! Рад видеть тебя!”


public class HW_4 {
    public static String replace(String text) {
        return text
                .replace('A', 'А').replace('a', 'а');
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        out.print("Введите ваше имя: ");
        String name = scan.nextLine();

        if (name.substring(0, 1).equalsIgnoreCase("а")) {
            out.print("Введите ваш возраст: ");
            int age = scan.nextInt();

            name = replace(name);

            if (name.substring(0, 1).equalsIgnoreCase("а") && age <= 30) {
                out.println("Привет ".concat(name.concat("! Ты молодец!")));
            } else if (name.substring(0, 1).equalsIgnoreCase("а") && age > 30) {
                out.println("Привет, ".concat(name.concat("! Ты молодец, но и мудрец уже!")));
            }
            } else {
                out.println("Привет, ".concat(name.concat("! Рад видеть тебя!")));
            }
        }
    }
