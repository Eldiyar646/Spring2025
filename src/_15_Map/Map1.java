package _15_Map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(43);
        list1.add(9);
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(55);
        set1.add(78);
        set1.add(14);
        // Мар не относится в интерфейс Collection
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(312, "KG");
        map1.put(36, "HU");
        map1.put(420, "CZ");
        map1.put(707, "KZ");
        map1.put(555, "KG");
        map1.put(555, "CZ");
        System.out.println(map1);

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("KG", "Bishkek");
        countries.put("HU", "Budapest");
        countries.put("KZ", "Astana");
        System.out.println(countries);

        // index -> java   -> 0,1,2,3,4,5,6,7,8,9,10.....
        // key   -> user   -> any data types

        // 01234
        // Salam

        // 0 1 2 3 4 5 6 7 8
        //{1,2,3,4,5,6,7,8,9}

        // () -> 16
        // (5)->

        Map<Integer, String> seasons = new HashMap<>();
        seasons.put(2, "Spring");
        seasons.put(3, "Summer");
        seasons.put(123, "Aloha");
        seasons.put(1, "Winter");
        seasons.put(4, "Fall");
        seasons.put(910, "Salam");
        seasons.put(-12, "Nihao");
        seasons.put(-35, "No season");
        System.out.println(seasons);

        Map<Integer, String> season2 = new LinkedHashMap<>(seasons);
        System.out.println(season2);

        Map<Integer, String> season3 = new TreeMap<>(season2);
        System.out.println(season3);

        Map<Integer, String> map2 = new LinkedHashMap<>();
    }
}