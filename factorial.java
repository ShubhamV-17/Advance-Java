public class factorial {

    public static int printingfactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int z = printingfactorial(10);
        System.out.println(z);

    }

}
