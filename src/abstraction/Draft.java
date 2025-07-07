package abstraction;

import java.util.LinkedHashMap;
import java.util.Map;

public class Draft {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Mn", 13000);
        map1.put("Tu", 12583);
        map1.put("Wd", 10473);
        map1.put("Th", 7291);
        map1.put("Fr", 9820);
        map1.put("St", 25000);
        map1.put("Sn", 12534);

        System.out.println(map1);
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());

        for (String key : map1.keySet()){
            System.out.println(key);
        }

        for (Integer value: map1.values()){
            System.out.println(value);
        }

        for (String key : map1.keySet()){
            System.out.println("Key: " + key + " \t\t\t value: " + map1.get(key));
        }

        for (Map.Entry<String, Integer> key_value : map1.entrySet()){
            System.out.println(key_value);
        }
    }
}
