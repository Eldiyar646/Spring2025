package _13_list._02_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class List3 {
    public static void main(String[] args) {

        //    Home work: Переставить элементы так, чтобы все чётные оказались после нечётных
        //    (Создать LinkedList)
        //    [1, 2, 3, 4, 5] -> [1, 3, 5, 2, 4]

//        LinkedList<Integer> oldList = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        System.out.println(oldList);
//
//        LinkedList<Integer> buffList = new LinkedList<>();
//        LinkedList<Integer> newList = new LinkedList<>();
//
//        for (int nums : oldList) {
//            boolean buiffer = nums % 2 == 0 ? buffList.add(nums) : newList.add(nums);
//            if (nums % 2 == 0) buffList.add(nums);
//            else newList.add(nums);
//        }
//        newList.addAll(buffList);
//        System.out.println(newList);


        Scanner scan = new Scanner(System.in);
        int count = 5;

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter numbers: ");
            int input = scan.nextInt();

            boolean addToList = input % 2 == 0 ? list1.add(input) : list2.add(input);
        }
        list2.addAll(list1);
        System.out.println(list2);


//        ArrayList<Integer> numbers1 = new ArrayList<>(); // Integer [] numbers1 = new Integer[5]
//        numbers1.add(12);
//        numbers1.add(55);
//        numbers1.add(23);
//        numbers1.add(10);
//        numbers1.add(3, 77);
//        System.out.println(numbers1);
//
//        LinkedList<Integer> numbers2 = new LinkedList<>();
//        numbers2.add(10);
//        numbers2.add(45);
//        numbers2.add(32);
//        numbers2.add(11);
//        numbers2.add(2, 99);
//        System.out.println(numbers2);

//        LinkedList<String> colors = new LinkedList<>();
//        colors.add("White");
//        colors.add("Yellow");
//        colors.add("Black");
//        colors.add("Blue");
//        colors.add("Green");
//        colors.add("Purple");
//        System.out.println(colors);
//        Collections.sort(colors);
//        System.out.println(colors);
//        Collections.reverse(colors);
//        System.out.println(colors);

//        Iterator<String> it = colors.iterator();
//        int count = 1;
//        while (it.hasNext()) {
//            it.next();
//            if (count % 3 == 0) {
//                it.remove();
//
//            }
//            count++;
//        }
//        System.out.println(colors);

        LinkedList<Integer> list8 = new LinkedList<>(List.of(1, 2, 1, 3, 2, 4));
        System.out.println(list8);

        LinkedList<Integer> duplicateList = new LinkedList<>();

        for (Integer num : list8) {
            if (Collections.frequency(list8, num) > 1) {
                int count1 = 2;
                for (int i = 0; i < count1; i++) {
                    duplicateList.add(num);

                }
            }
        }
        System.out.println(duplicateList);
    }
}