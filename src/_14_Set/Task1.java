package _14_Set;

import java.util.*;


public class Task1 {
    public static void main(String[] args) {

        //Set:
        // 1. HashSet()
        // 2. LinkedHashSet()
        // 3. TreeSet()

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(100);
        set1.add(28);
        set1.add(100);
        set1.add(11);
        set1.add(30);
        set1.add(9);
        set1.add(100);
        set1.add(54);
        System.out.println(set1);
        System.out.println(set1.getClass());

        LinkedHashSet<Integer> set3 = new LinkedHashSet<>(set1);
        System.out.println(set3);

        TreeSet<Integer> set2 = new TreeSet<>(set1);
        System.out.println(set2);

        List<String> names = Arrays.asList("Anna", "Tom", "Anna", "Mike", "Tom");
        Set<String> uniqueNames = new HashSet<>(names);

        for (String name : uniqueNames) {
            System.out.println(name);
        }





    }
}
