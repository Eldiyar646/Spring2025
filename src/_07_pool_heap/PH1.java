package _07_pool_heap;

import java.util.Scanner;

public class PH1 {
    public static void main(String[] args) {

        String str1 = "Hello";

        String str2 = new String("Hello");

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuffer sb4 = new StringBuffer("Hello");

        System.out.println(sb1 + "---" + sb1.hashCode());
        System.out.println(sb2 + "---" + sb2.hashCode());
        System.out.println(sb3 + "---" + sb3.hashCode());
        System.out.println(sb4 + "---" + sb4.hashCode());

        System.out.println(str1); // Hello saves in pool. There are have equals hashcodes
        System.out.println(str2); // Hello saves in pool
        System.out.println(sb1);  // Hello saves in heap
        System.out.println(sb2);  // This Hello saves in heap

        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());

          //System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.toString().equals(sb2.toString()));
          //System.out.println(str1 == sb1);
        System.out.println(str1.equals(sb1.toString()));

//        Scanner scanner = new Scanner(System.in);
//
//        String name3 = "Alex";
//        System.out.println(name3 + " - " + name3.hashCode());
//
//        String name4 = scanner.nextLine();
//        System.out.println(name4 + " - " + name4.hashCode());
//
//        if (name3.equals(name4)) {
//            System.out.println("++++");
//        }else {
//            System.out.println("-----");
//        }

        // Стринг не изменяемый. если есть два значения сохраняется как один, он запрещает изменять, так как он меняет остальные значения
        // Стрингбилдер и Стрингбуффер изменяемые. можно манипулировать, менять, изменение одного не влияет на остальные
        // мы не должны сравнивать объекты, строки с другими объектами или строками, нельзя применять == (тут выдаст ошибку) или .икуалс (тут выдаст ЛОЖЬ фолс)
        // можно сравнивать значения объектов с помощью туСтринг




    }
}
