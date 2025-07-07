package _13_list._02_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List4 {
    public static void main(String[] args) {
//        Найти k-й элемент с конца
//                [10, 20, 30, 40, 50],
//        при k = 2 -> ответ: 40 (второй с конца)

//        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
//        int k = 2;
//        System.out.println(list.get(list.size() - k));

        List<Integer> list8 = new LinkedList<>(List.of(1, 2, 1, 3, 2, 4));
        System.out.println(list8);

        List<Integer> uniqueList = new LinkedList<>();
        List<Integer> duplicateList = new LinkedList<>();

        for (Integer num : list8) {
            if (Collections.frequency(list8, num) == 1) {
                uniqueList.add(num);
            } else if (!duplicateList.contains(num)) {
                int count = Collections.frequency(list8, num);
                for (int i = 0; i < count; i++) {
                    duplicateList.add(num);
                }
            }
        }
        uniqueList.addAll(duplicateList);
        System.out.println(uniqueList);
    }
}