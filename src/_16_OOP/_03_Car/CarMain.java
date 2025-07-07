package _16_OOP._03_Car;

public class CarMain {
    public static void main(String[] args) {

        Name name = new Name("Lexus GS 300");
        Body body = new Body("Sedan");
        Engine engine = new Engine("2jz-gte", "V-shaped", "Petrol");
        Wheel wheel = new Wheel("Rear-wheel drive");

        Car cars = new Car(name, body, engine, wheel);
        System.out.println(cars);

        System.out.println("******************************");

        name.setNameCar("Honda");
        body.setType("Coupe");
        engine.setMark("i-VTEC");
        engine.setCylinders("Opposite");
        engine.setFuel("Gas");
        wheel.setType("All-wheel drive");


        Car cars2 = new Car(name, body, engine, wheel);
        System.out.println(cars2);

    }
}
