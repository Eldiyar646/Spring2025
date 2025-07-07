package homework;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(is_str_anagrams("aabc" , "abcc"));
        System.out.println(is_str_anagrams("live", "evil"));
        inverted_map();
        number_of_bookings();
    }

    public static boolean is_str_anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        return map1.equals(map2);
    }

    public static void inverted_map() {
        Map<Integer, String> version_one = new HashMap<>
                (Map.of(1, "Audi", 2, "Lexus", 3, "Jeep"));
        Map<String, Integer> version_two = new HashMap<>();
        for (Map.Entry<Integer, String> entry : version_one.entrySet()) {
            version_two.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : version_two.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void number_of_bookings() {
        List<String> bookedRooms = new ArrayList<>(Arrays.asList("A1", "B2", "A1", "C3", "B2", "A1"));
        Map<String, Integer> booking_count = new HashMap<>();
        for (String room : bookedRooms) {
            booking_count.put(room, booking_count.getOrDefault(room, 0) + 1);
        }
        for (String key : booking_count.keySet()) {
            System.out.println(key + " - " + booking_count.get(key));
        }
    }
}