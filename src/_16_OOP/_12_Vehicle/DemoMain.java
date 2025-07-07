package _16_OOP._12_Vehicle;

public class DemoMain {
    public static void main(String[] args) {

        Vehicle obj = new Vehicle(1, "Mers", "222", "White");
        obj.drive();
        System.out.println(obj);

        Car bmw = new Car(2, "BMW", "E34", "Black");
        bmw.drive();
        System.out.println(bmw);

        Car audi = new Car("Audi", "Q7");
        audi.stop();
        System.out.println(audi);

        Motorcycle moto = new Motorcycle(3, "Yamaha", "100", "Grey");
        moto.turnRight();
        System.out.println(moto);

        BMW bmwX7 = new BMW(4, "BMW", "X7", "Blue", true);
        System.out.println(bmwX7);


    }

}
// parent class / super class
// child class / subclass

//single inheritance: Vehicle -> Car
//-----------------------------------------------
// hierarchical inheritance: Vehicle -> Car
// -> Motorcyle
// -> Bus
//------------------------------------------------
// multilevel inheritance: Vehicle -> Car -> BMW -> motorcycle
// -> crossover
// -> sedan

// this (use fields in current class)
// super (use fields from parent class)

// inheritance
// 1. constructor inherit by manual
// 2. all fields & methods inherit by default
