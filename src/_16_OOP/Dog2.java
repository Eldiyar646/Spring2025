package _16_OOP;

public class Dog2 {
    public static void main(String[] args) {

        Dog rex = new Dog();

        System.out.println(rex.id);
        System.out.println(rex.name);
        System.out.println(rex.age);
        System.out.println(rex.breed);

        System.out.println(Dog.bark());
        System.out.println(rex.sleep());
        Dog.smell();

        int time = 12;

        if (time > 6 && time < 22) {
            System.out.println(rex.name + " - " + Dog.bark());
        } else {
            System.out.println(rex.name + " - " + Dog.sleep());
        }
    }
}
