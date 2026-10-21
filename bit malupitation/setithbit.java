public class setithbit {
    public static int set_karo(int n, int i) {
        int bitmax = 1 << i;
        return n | bitmax;
    }

    public static void main(String[] args) {
        System.out.println(set_karo(10, 2));

    }
}
