public class ithbit {
    public static int i_thbit(int n, int i) {
        int bitmax = 1 << i;
        if ((n & bitmax) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(i_thbit(15, 7));
    }
}
