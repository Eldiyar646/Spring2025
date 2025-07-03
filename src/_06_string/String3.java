package _06_string;

public class String3 {
    public static void main(String[] args) {
//
//        String word = "Kyrgyzstan";
//
//        boolean newWord = word.substring(0, 6).toUpperCase().replace("GYZ", "TUR").toLowerCase().contains("ur");
//        System.out.println(newWord);
//

        String city1 = "Bishkek"; //1561170901
        String city2 = "Bishkek"; //1561170901
        String city3 = "Bishkek"; //1561170901
        String city4 = "London";
        String city5 = city1.toUpperCase(); // 614500309
        String city6 = city2.toLowerCase();
        System.out.println(city3.hashCode());

        city1.toUpperCase();
        System.out.println(city5);
        System.out.println(city6);

        System.out.println(city5.hashCode());

        System.out.println(city1 == city5);
        System.out.println(city1.equals(city5));


    }
}
