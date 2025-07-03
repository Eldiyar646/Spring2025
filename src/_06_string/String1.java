package _06_string;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("Hello");

//                     012345
        String str3 = "Salam"; // ['s','a','l','a','m']

//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();

        //NON primitive data types
        // Class

        //class String: methods
        //class Scanner: methods --> next.Line(); next();

        // length() ---> возвращает длину индекса
        String word = "green";

        System.out.println(word.length());

        // charAt() ---> возвращает символ
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));

        // concat() --- соединяет строки к строке, вместо знака +
        String word2 = "Card";
        System.out.println(word + word2);
        System.out.println(word.concat(word2));

        // substring() ---> возвращает строку либо с начала до конца, либо в промежутке строк
        //               012345678901. 11
        String laptop = "Mac Book Pro";
        System.out.println(laptop);
        //                          10
        //                012345678901234567. 17
        String laptop1 = "Lenovo Legion four";
        System.out.println(laptop1);

        System.out.println(laptop1.substring(0,6));
        System.out.println(laptop1.substring(7,13));
        System.out.println(laptop1.substring(14));

        System.out.println(laptop.substring(4));
        System.out.println(laptop.substring(4, 8));

        // trim() --- удаляет лишние пробелы
        String phone = "          Samsung Galaxy";
        System.out.println(phone);
        System.out.println(phone.trim());


        // indexOf() --- помогает отыскать строки, индексы
        String country = "New York";
        System.out.println(country.indexOf('w'));
        System.out.println(country.indexOf('Y'));
        System.out.println(country.indexOf(' '));
        System.out.println(country.indexOf(89));

        String country2 = "Kyrgyzstan";
        System.out.println(country2.indexOf('y'));
        System.out.println(country2.indexOf('y', 2));

        String phrase = "Baby Baby Baby ooooooh Justin Baby";
        System.out.println(phrase.indexOf("Baby", 20));

        // equals() --- строгое сравнение
        System.out.println("Kalys".equals("Kalys"));

        // equalsIgnoreCase()
        System.out.println("Manas".equalsIgnoreCase("Kalys"));

        // toLowerCase()
        //                0123
        String flowers = "Rose";
        System.out.println(flowers.toLowerCase());

        // toUpperCase()
        System.out.println(flowers.toUpperCase());

        System.out.println(flowers.substring(0,1).toUpperCase()
                .concat(flowers.substring(1).toLowerCase())); //Rose

        System.out.println(flowers.substring(0,3).toLowerCase()
                .concat(flowers.substring(3).toUpperCase())); //rosE

        System.out.println(flowers.substring(0,1).toUpperCase()
                .concat(flowers.substring(1,3).toLowerCase()
                        .concat((flowers.substring(3).toUpperCase())))); //RosE

        // replace()
        String dn = "Winter, Spring, Summer, Fall";
        System.out.println(dn);
        System.out.println(dn.replace('m', 'M'));
        System.out.println(dn.replace("in", "PO"));

        //                         10        20
        //               0123456789012345678901. 22
        String coffee = "Adriano coffee coffee";
        System.out.println(coffee.indexOf('o', 9));
        System.out.println(coffee.lastIndexOf('o'));
        System.out.println(coffee.indexOf('f', 13));



        System.out.println(coffee.substring(0, 14).replace("coffee", "tea")
                .concat(" and ").concat(coffee.substring(15, 21)));

        System.out.println(coffee.substring(0, 14).concat(" and ").concat(coffee.substring(15, 21)
                .replace("coffee", "tea")));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter symbol: ");
        char ch = scanner.next().charAt(0);

        if(true) {
            System.out.println(ch);
        } else {
            System.out.println(false);
        }

    }
}
