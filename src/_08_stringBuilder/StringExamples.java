package _08_stringBuilder;

import java.util.Scanner;

public class StringExamples {

    public static final String CORRECT_CHARS = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {


//   String test = "        Салам мыла раму";
//
//   System.out.println(test.substring(2)); // третий индекс включительно считается,
//   т.е. выводит символ под третим индексом тоже
//
//   String test1 = new Scanner(System.in).nextLine();
//   System.out.println(test.substring(1,3));   // substring включает первый индекс, но не включает третий индекс
//   если слово состоит из 5 элементов или 4 индекса, САЛАМ (1,3) это будет АЛ
//
//   System.out.println(test.substring(test.indexOf(' '), test.lastIndexOf(' ')).trim());


//        String input = String.valueOf(new Scanner(System.in).nextLine().trim());
//        boolean isValid = true;
//        int spaceCount = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            if(input.charAt(i) == ' ') {
//                spaceCount++;
//            }
//            if (!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))) {
//                isValid = false;
//                break;
//            }
//        }
//        if (isValid && spaceCount == 1) {
//            System.out.println(input.substring(input.indexOf(' ')).trim());
//        } else {
//            System.out.println("incorrect");
//        }
//

    }
}


//        String input = new Scanner(System.in).nextLine();
//        int lastNum = Integer.parseInt(String.valueOf(input.charAt(input.length()-1)));
//        System.out.println(lastNum);