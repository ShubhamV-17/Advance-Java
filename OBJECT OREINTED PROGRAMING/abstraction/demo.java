abstract class animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends animal {
    void walk() {
        System.out.println("horse walk on 4 legs");
    }
}

class chiken extends animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class demo {
    public static void main(String[] args) {

        horse h = new horse();
        h.eat();
        h.walk();

        chiken c = new chiken();
        c.eat();
        c.walk();
    }
}
