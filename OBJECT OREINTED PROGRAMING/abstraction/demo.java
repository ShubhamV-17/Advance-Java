// Parent Abstract Class
abstract class Animal {

    // Abstract Class Constructor
    Animal() {
        System.out.println("Animal constructor is called");
    }

    // Non-Abstract Method
    void eat() {
        System.out.println("Animal eats");
    }

    // Abstract Method (No Body)
    abstract void walk();
}

// Child Class of Animal
class Horse extends Animal {

    // Horse Constructor
    Horse() {
        System.out.println("Horse constructor is called");
    }

    // Implementation of Abstract Method
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

// Child Class of Horse (Multilevel Inheritance)
class Mustang extends Horse {

    // Mustang Constructor
    Mustang() {
        System.out.println("Mustang constructor is called");
    }

    // walk() is inherited from Horse
}

// Another Child Class of Animal
class Chicken extends Animal {

    // Implementation of Abstract Method
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

// Main Class
public class demo {

    public static void main(String[] args) {

        // Creating Horse Object
        Horse h = new Horse();

        h.eat();
        h.walk();

        // Creating Chicken Object
        Chicken c = new Chicken();

        c.eat();
        c.walk();

        // Creating Mustang Object
        Mustang mg = new Mustang();

    }
}
