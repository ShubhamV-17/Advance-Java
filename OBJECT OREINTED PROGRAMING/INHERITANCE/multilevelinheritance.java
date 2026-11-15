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
    int legs;
}

// derived class
class dog extends mammals {
    String breed;
}

public class multilevelinheritance {
    public static void main(String[] args) {
        dog dobby = new dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
