package _13_list._01_ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List7 {
    public static void main(String[] args) {

        String s = "dad";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrom = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }
    }
}
