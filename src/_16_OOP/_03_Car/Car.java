package _16_OOP._03_Car;

public class Car {
    private Name name;
    private Body body;
    private Engine engine;
    private Wheel wheel;

    public Car(Name name, Body body, Engine engine, Wheel wheel) {
        this.name = name;
        this.body = body;
        this.engine = engine;
        this.wheel = wheel;
    }

    public Car (Name name, Engine engine, Body body, Wheel wheel) {
    }

    public String toString() {
        return "Марка авто: " + name + "\nМарка двигателя: " + engine + "\nТип кузова: " + body + "\nКолеса: " + wheel;
    }

    public Body getBody() { return body; }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
