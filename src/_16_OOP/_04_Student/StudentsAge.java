package _16_OOP._04_Student;

public enum StudentsAge {
    FIRST (18, 19, "Студент первого курса"),
    SECOND (20, 21, "Студент второго курса"),
    THIRD (22, 23, "Студент третьего курса"),
    UNKNOWN (0,0, "Возраст не соответствует ни одному курсу");

    private int age1;
    private int age2;
    private String value;

    StudentsAge (int age1, int age2, String value) {
        this.age1 = age1;
        this.age2 = age2;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getAge1() {
        return age1;
    }

    public int getAge2() {
        return age2;
    }

    public static StudentsAge findByAge(int age) {
        for (StudentsAge lvl : StudentsAge.values()) {
            if (age >= lvl.getAge1() && age <= lvl.getAge2()) {
                return lvl;
            }
        }
        return UNKNOWN;
    }
}
