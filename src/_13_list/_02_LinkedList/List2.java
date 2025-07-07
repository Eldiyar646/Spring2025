package _13_list._02_LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class List2 {
    public static void main(String[] args) {

        // Non-generic elements in LinkedList
        LinkedList list1 = new LinkedList();
        list1.add(23);
        list1.add("Hello");
        list1.add('*');
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (Object element : list1) {
            System.out.println(element);
        }

        System.out.println("_________________");


        LinkedList<String> names = new LinkedList<>();
        names.add("Helen");
        names.add("Will");
        names.add("Clark");
        names.add("John");
        names.addFirst("Kate");
        names.addLast("Bred");
        names.add(2, "Leo");
        names.addAll(Arrays.asList("Kanat", "Asyl", "Maksat"));
        names.addAll(1, Arrays.asList("Sasha", "Kiril"));
        names.remove("Helen");
        names.removeLast();
        System.out.println(names);
        names.removeIf(s -> s.contains("t"));
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);



    }
}
