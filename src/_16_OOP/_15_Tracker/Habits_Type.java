package _16_OOP._15_Tracker;

public enum Habits_Type {

    GOOD("хорошая привычка"),
    BAD("плохая привычка");

    private String value;

    Habits_Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}