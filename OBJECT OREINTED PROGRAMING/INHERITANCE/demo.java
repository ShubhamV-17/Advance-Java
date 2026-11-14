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
class fish extends animal {
    int fins;

    void swims() {
        System.out.println("swims in water......");
    }
}

public class demo {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}