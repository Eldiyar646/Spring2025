package _16_OOP;

public class Dog {

    // state - instance variables, если сущиствительное/прилагательное
    public String name = "Rex";
    public int age = 3;
    public String breed = "Shepherd";
    public int id = 4517;

    // behavior (action) - как делается/ что делается
    public static String bark(){
        return ("Bark-Bark");
    }

    public static String sleep(){
        return ("Zzzzzz...");
    }

    public static void smell(){
        System.out.println("Smelling...");
    }

}

// class level:
// 1. methods
// 2. instance variables / fields

// var : int num = 45;
// obj: Scanner scan = new Scanner(System.in),
//      StringBuilder sb1 = new StringBuilder("Hello)
//      sb1.revers()
//      sb1.append()
// Arrays: int nums [] = {1,4,7,2,0}, fixed size
// List: (no size) has index, has duplicates
//       1. ArrayList -> <>/non<>
//       2. LinkedList -> <>/non<>
// Set: (no size) no index, no duplicates
//       1. HashSet         -> unpredictable order
//       2. LinkedSet       -> linked order
//       3. TreeSet         -> sorted order
// Map: (no size) no index, but has kes(should be unique)
//       1. HashMap         -> unpredictable order
//       2. LinkedHashMap   -> linked order
//       3. TreeMap         -> sorted order
// obj: Class obj = new Class(); -> state, behaviors
//      Dog   rex = new Dog();
//      state:      rex.id; rex.name; rex.age; rex. breed
//      behavior:   rex.sleep(), DOg.bark(), Dog.smell()