public class even {
    public static void oddoreven(int n) {
        int bitmax = 1;
        if ((n & bitmax) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddoreven(11);
        oddoreven(5);
        oddoreven(2);

    }
}
