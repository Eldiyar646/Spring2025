import java.util.*;
import java.util.stream.Collectors;

public class Draft1 {
    public static void main(String[] args) {

        System.out.println(find_Digit("12.7"));
        System.out.println(result("acdfhra"));

        Draft1 obj = new Draft1();

        System.out.println(obj.rightDigit(List.of(16, 882, 8, 1)));
        System.out.println(obj.lower(List.of("AAA", "BBB", "ccc")));
        System.out.println(obj.noX(List.of("xxax", "xbxbx", "xxcx")));
        System.out.println(obj.noNeg(List.of(-3, -3, 3, 3, 0)));
        System.out.println(obj.no9(List.of(9, 19, 29, 3)));
        System.out.println(obj.noTeen(List.of(1, 14, 1)));
        System.out.println(obj.noZ(List.of("aaa", "bbb", "aza")));
        System.out.println(obj.noLong(List.of("aaa", "bbbb", "apple", "ap")));
        System.out.println(obj.no34(List.of("aaa", "bbbb", "apple", "ap")));
        System.out.println(obj.noYY(List.of("a", "b", "cy")));
        System.out.println(obj.noYY(List.of("xx", "ya", "zz")));


    }

    public static boolean find_Digit(String str) {
        return str.matches("-?\\d+\\.\\d+") ? true : false;

    }

    public static boolean result(String str) {
        Set<Character> symbols = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!symbols.add(ch)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> math1(List<Integer> nums) {
        nums.stream().map(s -> (s + 1) * 10).collect(Collectors.toList());
        return nums;
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(s -> s % 10).collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(s -> (s >= 0)).collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(s -> (s % 10 != 9)).collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(s -> s < 13 | s > 19).collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
//        Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
//        noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
//        noZ(["hziz", "hzello", "hi"]) → ["hi"]
//        noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]

        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 3 | s.length() >= 5).collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s + "y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(s -> (s * 2)).filter(s->s%10 != 2).collect(Collectors.toList());

    }

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(s -> (s * s) + 10 ).filter(s -> s % 10 != 5 & s % 10 !=6).collect(Collectors.toList());

    }

}