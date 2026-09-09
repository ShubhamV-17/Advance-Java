import java.util.Scanner;

// basic syntax of function

public class basic {
    public static void printhelloworld() {
        System.out.println("hello world ");
    }

    // function involving parameter

    public static int calculatesum(int a, int b) { // parameter or formal parameter
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b); // arguments or actual parameters
        printhelloworld();
    }
}
