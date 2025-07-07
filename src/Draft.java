import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Draft {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>(Arrays.asList("Bentley", "Honda", "Lexus", "Audi", "Lada"));
        cars.add("Mercedes Benz");

        Iterator<String> itr = cars.iterator();

        while (itr.hasNext()) {
            String car = itr.next();
            if (car.equalsIgnoreCase("lada")) {
                itr.remove();
                System.out.println(car);
                System.out.println(cars);
            }
        }



//        System.out.println(hasAllUniqueChars("a, b, c, d"));
//
//
//        Set<String> names = new HashSet<>();
//        names.add("Anna");
//        names.add("Boris");
//        names.add("Anna");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(5);
//        numbers.add(10);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(8);
//
//        System.out.println("Elements: ");
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//        Set<Integer> num1 = new TreeSet<>();
//        num1.add(3);
//        num1.add(15);
//        num1.add(1);
//        num1.add(3);
//        num1.add(7);
//
//        System.out.println("Elements: ");
//        for (int num : num1) {
//            System.out.println(num);
//        }
//
//
//        Set<String> fruits = new TreeSet<>();
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("orange");
//        fruits.add("kiwi");
//        fruits.add("melon");
//
//        System.out.println("Fruits sorted: ");
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        List<String> fruits1 = new ArrayList<>();
//        fruits1.add("apple");
//        fruits1.add("banana");
//        fruits1.add("orange");
//        fruits1.add("kiwi");
//        fruits1.add("melon");
//        fruits1.add("melon");
//
//
//        Set<String> fruits2 = new TreeSet<>(fruits1);
//
//        System.out.println("Fruits sorted: ");
//
//        for (String fruit3 : fruits2) {
//            System.out.println(fruit3);
//        }
//
//        Set<String> fruits4 = new LinkedHashSet<>();
//        fruits4.add("apple");
//        fruits4.add("banana");
//        fruits4.add("orange");
//
//        List<String> list5 = new ArrayList<>(fruits4);
//        System.out.println("List: ");
//        for (int i = 0; i < list5.size(); i++) {
//            System.out.println(list5.get(i));
//        }


//        String[] arrLogin = {"eld123", "abcde", "12345", "qwerty", "polipo"};
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter your login:");
//        String loginName = scan.next();
//        boolean isExist = false;
//
//        for (int i = 0; i < arrLogin.length; i++) {
//            if (arrLogin[i].equals(loginName)) {
//                System.out.println(loginName + " - right");
//                isExist = true;
//            }
//        }
//        if (!isExist) {
//            System.err.println("Error");
//        }
//    }

    }

//    public static boolean hasAllUniqueChars(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//            if (currentChar == ',') continue;
//            for (int j = i + 1; j < str.length(); j++) {
//                if (currentChar == str.charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


}