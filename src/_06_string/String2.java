package _06_string;

public class String2 {
    public static void main(String[] args) {

        String name1 = "Alex";
        String name2 = "Alex";
        String name3 = name1 + "Killian";

        //Pool                 Heap
        //Alex                 2043454
        //Alex killian
        //ALEX                 2011678

        // ==        -> links (hshcodes)
        // .equal    -> values

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(2043454 == 2043454);
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);
        String name5 = name1.toUpperCase();
        System.out.println(name5);
        System.out.println(name5.hashCode());


    }
}
