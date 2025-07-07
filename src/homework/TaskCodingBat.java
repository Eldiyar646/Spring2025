package homework;

public class TaskCodingBat {
    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(middleThree("CandY"));
        System.out.println(middleTwo("CandYs"));
        System.out.println(atFirst(""));
        System.out.println(seeColor("xxred"));
        System.out.println(withoutX2("xaxb"));
        System.out.println(notString(""));
        //     System.out.println(nearHundred(110));
        //     System.out.println(notString2("trash"));
        System.out.println(delDel("adelbc"));
        System.out.println(mixStart("9ix"));
        System.out.println(startOz("ozmandiaz"));

    }

    //    left2("Hello") → "lloHe"
//    left2("java") → "vaja"
//    left2("Hi") → "Hi"
    public static String left2(String str) {
        String first = str.substring(0, 2);
        String two = str.substring(2);
        return two + first;
    }

    //    right2("Hello") → "loHel"
//    right2("java") → "vaja"
//    right2("Hi") → "Hi"
    public static String right2(String str) {
        int len = str.length();
        String lastTwo = str.substring(len - 2); // последние 2 символа
        String beginning = str.substring(0, len - 2); // остальная часть
        return lastTwo + beginning;
    }

    public static String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

    public static String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    public static String atFirst(String str) {
//        atFirst("hello") → "he"
//        atFirst("hi") → "hi"
//        atFirst("h") → "h@"

        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@" + "@";
        }
    }

    //    seeColor("redxx") → "red"
//    seeColor("xxred") → ""
//    seeColor("blueTimes") → "blue"
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    //    withoutX2("xHi") → "Hi"
//    withoutX2("Hxi") → "Hi"
//    withoutX2("Hi") → "Hi"
    public static String withoutX2(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }

    public static String notString(String str) {
        String str1 = "not ";
        return str.startsWith("not") ? str : str1 + str;
//        if (str.startsWith("not")) {
//            return str;
//        } else {
//            return str1 + str;
//        }
    }

//    public static boolean nearHundred(int n) {
//        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
//
//    }
//
//    public static String notString2(String str) {
//        return (str.length() >= 3 && str.substring(0, 3).equals("not")) ? str : "not " + str;
//
//    }


    //    delDel("adelbc") → "abc"
//    delDel("adelHello") → "aHello"
//    delDel("adedbc") → "adedbc"
    public static String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        } else {
            return str;
        }
    }

    public static boolean mixStart(String str) {
//        mixStart("mix snacks") → true
//        mixStart("pix snacks") → true
//        mixStart("piz snacks") → false
        if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public static String startOz(String str) {
//        startOz("ozymandias") → "oz"
//        startOz("bzoo") → "z"
//        startOz("oxx") → "o"

        String ss = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            ss += "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            ss += "z";
        }
        return ss;
    }
}

