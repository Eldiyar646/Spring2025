package _13_list._01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

//remove words with two duplicates digits

public class List6 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("book", "back", "apple", "java", "test", "poor", "door"));
        Collections.sort(words);


        Iterator<String> itr = words.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    itr.remove();
                    break;
                }
            }
        }
        System.out.println(words);

    }
}
