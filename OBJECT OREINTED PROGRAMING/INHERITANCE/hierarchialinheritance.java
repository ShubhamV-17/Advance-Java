// base class
class animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// derived class
class mammals extends animal {
    void walk() {
        System.out.println("walks");
    }
}

// derived class
class fish extends animal {
    void swim() {
        System.out.println("swims");
    }
}

class bird extends animal {
    void fly() {
        System.out.println("flying");
    }
}

public class hierarchialinheritance {
    public static void main(String[] args) {
        bird flapyBird = new bird();
        flapyBird.eat();
    }
}
