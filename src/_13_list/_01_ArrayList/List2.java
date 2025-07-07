package _13_list._01_ArrayList;

import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(28);
        list1.add(1, 33);

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                list1.add(i);
            }
        }
        System.out.println("Original " + list1);

        list1.removeIf(num -> num >= 10);
        System.out.println("Remove > 10 : " + list1);


//        int[] nums = {10, 33, 28, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
//        System.out.println(Arrays.toString(nums));
//        for (int i = 0; i < list1.size() ; i++) {
//            if (list1.get(i) >= 10) {
//                list1.remove(i);
//            }
//
//        }
//        System.out.println(list1);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bishkek");
        cities.add("Tashkent");
        cities.add("Astana");
        cities.add("Moscow");
        cities.add("London");
        System.out.println(cities);
        cities.removeIf(c -> c.contains("a"));
        System.out.println(cities);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(-8);
        nums.add(12);
        nums.add(-32);
        nums.add(52);
        nums.add(-45);
        nums.add(144);
        nums.add(-15);
        nums.add(162);


        nums.removeIf(n -> n < 0 && n % 2 != 0);
        System.out.println(nums);

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("");
        nameList.add("Emir");
        nameList.add("Mirqul");
        nameList.add("Ali");
        nameList.add("Bek");
        nameList.add("");

        nameList.removeIf(n -> n.equals(""));
        System.out.println(nameList);
        nameList.removeIf(String::isBlank);
        System.out.println(nameList);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(5);
        list4.add(44);
        list4.add(24);
        list4.add(5665);
        list4.add(1221);
        list4.add(22);
        list4.add(523);
        list4.add(90);
        System.out.println("Original: " + list4);

        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int number : list4) {
            String numStr = String.valueOf(number);
            if (numStr.length() >= 2) { // исключаем однозначные числа
                String reversed = new StringBuilder(numStr).reverse().toString();
                if (numStr.equals(reversed) && !numbersList.contains(number)) {
                    numbersList.add(number); // добавляем только, если ещё не было
                }
            }
        }

        System.out.println("Палиндромы (без однозначных и без дубликатов): " + numbersList);
    }
}