class animal {
    void eat() {
        System.out.println("eats food");
    }
}

class deer extends animal {
    @Override
    void eat() {
        System.out.println("eats grass");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        deer d1 = new deer();
        d1.eat();
    }
}
