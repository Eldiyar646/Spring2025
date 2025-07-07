package _13_list._02_LinkedList;

import java.util.*;

public class List1 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(56);
        list1.add(12);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(12,45,89,23));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(77);
        list3.addAll(Arrays.asList(25,89,8,34));

        ArrayList<Integer> list4 = new ArrayList<>(list1);

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(list2);

        List<Integer> list6 = new ArrayList<>();

        ArrayList<Integer> list7 = new ArrayList<>(List.of(12,45,68,90));
        list7.add(55);
        System.out.println(list7);

        List<Integer> list8 = List.of(12,45,68,90);
        System.out.println(list8);

    }
}
