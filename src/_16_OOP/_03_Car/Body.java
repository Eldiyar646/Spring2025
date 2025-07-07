package _16_OOP._03_Car;

public class Body {

    private String type;

    public Body(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getType();
    }
}
