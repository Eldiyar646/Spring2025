package _16_OOP._12_Vehicle;

public class Vehicle {
    public int id;
    String mark;
    String model;
    String color;
    boolean equipment;


    public Vehicle(int id, String mark, String model, String color) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.equipment = equipment;
    }

    public Vehicle(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public void drive () {
        System.out.println(mark + " is starting");
    }

    public void turnRight () {
        System.out.println(mark + " is turn right");
    }

    public void stop () {
        System.out.println(mark + " is stopped");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Mark: " + mark + ", Model: " + model + ", Color: " + color + (equipment ? ", Equipment: " + equipment: "");
    }
}
