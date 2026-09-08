public class callbyreference {
    // this is called call by reference

    public static void notswap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        notswap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
