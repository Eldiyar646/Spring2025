package _16_OOP._07_Example;

public class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }
    public void start(){
        System.out.println("Engine " + type + " startet");
    }
}

// Ассоциация
// 1. is a
// 2. has a это отношение делится на два: 1. Композиция
//                                        2. Агрегация


// Мерседес это машина (is a car).
// Водитель это человек (is a person).

// второй пункт это компонент т.е. тут говориться про (has a).
// У человека есть сердце. Машина имеет двигатель.