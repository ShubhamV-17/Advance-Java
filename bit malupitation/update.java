
public class update {
    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updatebit(int n, int i, int newbit) {
        n = clear(n, i);
        int bitwise = newbit << i;
        return n | bitwise;
    }

    public static void main(String[] args) {
        System.out.println(updatebit(10, 2, 1));
    }
}
