package _14_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>(Arrays.asList("Kate10", "Jane20", "Steve"));
//
//        for (String name : names) {
//            if (names.contains(".*\\d.*")) {
//                names.remove(".*\\d.*");
//            }
//            System.out.println(name);
//        }


        Set<String> set1 = new HashSet<>(Arrays.asList("Java is powerful and fun".split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList("Python is powerful too".split(" ")));

        if (set1.contains("powerful") && set2.contains("powerful")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        Home work: Найти первую повторяющуюся букву в строке
//        Ввод: "abcdefbgh"
//        Вывод: b


        Set<String> set = new HashSet<>(Arrays.asList("abcdefbgh"));
        String str = "";
        for (String s : set) {
            str = s;
            break;
        }
        Set<Character> setset = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (setset.contains(ch)) {
                System.out.println(ch);
                return;
            } else {
                setset.add(ch);
            }
        }
        System.out.println(set);
    }
}
