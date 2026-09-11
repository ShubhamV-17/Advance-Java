public class inrange {

    public static boolean isprime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeinrange(int n) {

        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(isprime(16));

    }
}
