package _16_OOP._07_Example;

public class Car {

    public String mark;
    public String model;
    public String color;
    private Engine engine;


    public Car(String mark, String model, String color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.engine = new Engine("V8");
    }

    public void startCar() {
        engine.start();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
