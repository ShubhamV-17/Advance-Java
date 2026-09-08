public class swap {
    public static void swapcode() {

    }

    // this is called swap code or call by value
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
