package _09_Java_metods._03_static_methods;

import _08_stringBuilder.StrBuilder2;

public class Method1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");
        System.out.println(sb.capacity());




        System.out.println(endUp("hi"));
    }

    public static String endUp(String str) {
        if (str.length() > 2) {
            if (str.length() <= 2) {
                return str.substring(str.length()).toUpperCase();
            } else {

            }
            String str1 = str.substring(str.length() - 3);
            return str1.toUpperCase();
        }
        return "";
        }

}


// 1. static.     ->
// 2. non-static. ->

// static method
// in current class -> calls with method_name
// in another class -> calls via class_name.method+name

// non-static method
// in current class -> calls with object
// in another class -> calls with object

// non-static
// 1. void method.    -> same_class(obj) | another_class(obj)
// 2. return method.  -> same_class(obj) | another_class(obj)

// static
// 1. void method.    -> method_name.    | ClassName.methodName
// 2. return method   -> method_name     | ClassName.methodName