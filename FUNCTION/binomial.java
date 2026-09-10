public class binomial {
    public static int factorial(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int printbinomial(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n - r);

        int printbinomial = fac_n / (fac_r * fac_nmr);

        return printbinomial;
    }

    public static void main(String[] args) {
        System.out.println(printbinomial(5, 2));

    }
}
