package homework.ClassWork;

public class Main_04_05_25 {
    public static void main(String[] args) {

        Peoples aizat = new Peoples("Aizat", "Female", 34, 60, 175, "Mercedes-Benz");
        aizat.printAll();

        System.out.println();

        Peoples alima = new Peoples("Alima", "Female", 7, 20, 120, "Aston Martin");
        alima.printAll();

        System.out.println();

        Peoples aliyar = new Peoples("Aliyar", "Male", 5, 18, 110, "Lexus LX 570");
        aliyar.printAll();

    }
}
