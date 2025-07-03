package _08_stringBuilder;

import java.util.Scanner;

import static java.lang.System.out;

public class HW_3 {
    public static void main(String[] args) {

//        Создать StringBuilder, если длина слова меньше или равно 4 символам,
//        то вернуть это же слово, если длина слова состоит из четных чисел
//        то перевернуть первую половину слова, иначе вернуть фразу «длина слова не четное»
//
//        Например введут слово “java”, состоит из 4-букв, то вернуть её же.
//        Если введут слово “nomads”, слово состоит из 6-букв, значит нужно
//        возвратить первую половину слова наоборот, то есть как «mon»
//        Если слова не четное, то вернуть, что «длина слово не четное число»

        Scanner scan = new Scanner(System.in);
        out.println("Введите слово: ");
        StringBuilder word = new StringBuilder(scan.nextLine());
        var middle = word.length() / 2;
        if (word.length() > 4) {
            if (word.length() % 2 == 0) {
                out.println(word.reverse());
                out.println(word.delete(0, word.length() - 3));
            } else {
                out.println("Длина слова нечетное число.");
            }
        } else {
            out.println(word);
        }
    }
}

