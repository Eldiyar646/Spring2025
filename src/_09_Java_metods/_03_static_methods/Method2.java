package _09_Java_metods._03_static_methods;

public class Method2 {
    public static void main(String[] args) {

        //  ticketCheking("John Doe", 567);


        System.out.println(lastChars("last", "chars"));

    }

    //
//    public static void ticketCheking(String fullName, int code) {
//        String user_name = "John Doe";
//        int user_code = 567;
//
//        if (fullName.equals(user_name)) {
//            if (code == user_code) {
//                System.out.println("Причина вашего полета");
//            } else {
//                System.out.println("incorrect code");
//            }
//        } else {
//            System.out.println("incorrect names");
//        }
//    }
//

//    nonStart("Hello", "There") → "ellohere"
//    nonStart("java", "code") → "avaode"
//    nonStart("shotl", "java") → "hotlava"

    public static String nonStart(String a, String b) {

        return a.substring(1).concat(b.substring(1));
    }

    public static String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;
    }

    public static String front22(String str) {
        if (str.length() <= 2 || str.length() == 1) {
            return str + str + str;
        } else {
            return str.substring(0, 2).concat(str).concat(str.substring(0, 2));
        }
    }

    public static boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        } else {
            return false;
        }
    }

//    lastChars("last", "chars") → "ls"
//    lastChars("yo", "java") → "ya"
//    lastChars("hi", "") → "h@"

    public static String lastChars(String a, String b) {
        if (a.length() >= 1 && b.length() > 1) {
            String word = a.charAt(0) + b.substring(b.length() - 1);
            return word;
        }
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        if (a.length() >= 2 && b.length() == 0) {
            return a.substring(0, 1) + b.replace("", "@");
        } else {
            return a.replace("", "@") + b.substring(b.length() - 1);
        }
    }

}

