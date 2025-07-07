package _16_OOP;

public class Dog2_2 {
    public static void main(String[] args) {


        Dog rex = new Dog();
        System.out.println("REX: \n" + rex.id + "," + rex.name + "," + rex.age+ "," + rex.breed);

        rex.breed = "Labrador";
        System.out.println("REX: \n" + rex.id + "," + rex.name + "," + rex.age+ "," + rex.breed);



    }

}
