package _13_list._01_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class List3 {
    public static void main(String[] args) {

//        Есть два списка строк. Создай третий список, в который попадут все элементы
//        из двух списков, но без повторов (используйте contains для проверки).
//[“apple", "banana", "orange", "kiwi”]
//[“banana", "grape", "kiwi", "melon”]
//[“apple”, “banana”, “orange”, “kiwi”, “grape”, “melon”]

        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("apple");
        fruits1.add("banana");
        fruits1.add("orange");
        fruits1.add("kiwi");
        System.out.println("1. Original: " + fruits1);

        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("banana");
        fruits2.add("grape");
        fruits2.add("kiwi");
        fruits2.add("melon");
        System.out.println("2. Original: " + fruits2);

        ArrayList<String> fruits3 = new ArrayList<>(fruits1);
        fruits2.removeIf(s -> s.contains("banana") || s.contains("kiwi"));
        fruits3.addAll(fruits2);
        Collections.sort(fruits3);
        System.out.println("3. Without loop: " + fruits3);

        System.out.println("-------------------");


        for (int i = 0; i < fruits2.size(); i++) {
            String result = fruits2.get(i);
            if (!fruits3.contains(result)) {
                fruits3.add(result);
            }
        }
        Collections.sort(fruits3);
        System.out.println("4. With loop: " + fruits3);
    }
}