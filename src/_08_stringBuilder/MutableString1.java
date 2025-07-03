package _08_stringBuilder;

import java.util.Locale;
import java.util.Scanner;

public class MutableString1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.hashCode());
        System.out.println(sb1.capacity()); //16
        sb1.append("Bishkek");
        System.out.println(sb1);
        System.out.println(sb1.hashCode());
        System.out.println(sb1.capacity()); //16
        sb1.append("Kyrgyzstan");
        System.out.println(sb1.capacity()); //34
        sb1.append("312Belinskayatester");
        System.out.println(sb1.capacity());

        System.out.println((34 + 1) * 2);

        //concat -> String.concat(String)
        //append -> SBuilder.append(SB)
        //append -> SBuilder.append(int)
        //append -> SBuilder.append(byte)
        //append -> SBuilder.append(String)
        //append -> SBuilder.append(boolean)

        StringBuilder sb2 = new StringBuilder(5);
        System.out.println(sb2.capacity());  //5
        sb2.append("Salam");
        System.out.println(sb2.capacity());  //5
        sb2.append("NewYork");
        System.out.println(sb2.capacity());  //12
        sb2.append("London");
        System.out.println(sb2.capacity());  //26

        System.out.println((12 + 1) * 2);

        StringBuilder sb3 = new StringBuilder("red");
        System.out.println(sb3);
        System.out.println(sb3.capacity()); //19
        sb3.append("zxcvbm");
        System.out.println(sb3.capacity());  //19
        sb3.append("asdfghjkl");
        System.out.println(sb3.capacity()); //19
        sb3.append("#$%");
        System.out.println(sb3.capacity()); //40

        System.out.println((19 + 1) * 2);

        // (oldCapacity + 1) * 2 formula of StringBuilder

        // Home work, .insert(), .replace(), .reverse(), .delete(), .deleteCharAt()


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter some word: ");
//        String word = scanner.nextLine();
//
//        StringBuilder word2 = new StringBuilder(word);
//
//        if (word.equalsIgnoreCase(word2.toString())) {
//            System.out.println(word2.append(" is polindrome"));
//        } else {
//            System.out.println(word2.append(" is not polindrome"));
//        }

        StringBuilder sb4 = new StringBuilder("Welcome"); // создаем значение, а после редактируем, и после уже выводим на консоль.
        boolean str = sb4.append("to Dubai").append('!').insert(0,'%').insert(8, " ").delete(0,1).toString().toUpperCase().contains("kate");
        System.out.println(str);

        Scanner input = new Scanner(System.in);

        String s1 = "Salam";
        String s2 = new String("Salam");

        String s3 = input.next();
        String s4 = new String (input.next());


// String == String      -> true(same hash codes)
// String.equals(String) -> true(same values)

// StringBuilder == StringBuilder       -> false(object != object)
// StringBuilder.equals(StringBuilder)  -> false(object != object)
// StringBuilder.toString.equals(StringBuilder.toString)  -> true(object == object)

// String == StringBuilder  -> false (pool != heap)
// StringBuilder == String  -> false (pool != heap)
// String.equals(StringBuilder.toString)  -> true (same values)
// StringBuilder.toString.equals(String)  -> true (same values)


//   String s1 = "Salam";
//   String s2 = new String("Salam");

// s1 == s2  -> false (variable != object)
// s2 == s1  -> false (object != variable)
// s1.equals(s2) -> true(same values)
// s2.equals(s1) -> true(same values)






    }
}