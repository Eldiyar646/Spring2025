package repetition;

public class Program2 {
    public static void main(String[] args) {
        // Aritmhmetic operators -> +,  -, *, /, %, ++, --

        int num1 = 90;
        int num2 = 89;
        int result = num1 + num2;


        // Assignment operators -> =, +=, -=, *=, /=, %=

        int num = 6;
        num += 2;
        System.out.println(num);

        // Logical operators
        // &&, ||, !
//                         false        true
        System.out.println(10 > 23 && 90 == 90); //false

//                         false        true
        System.out.println(10 > 23 || 90 == 90); //true


        System.out.println(!(10 > 23 && 90 == 90)); //true
    }
}
