import java.util.*;

public class invertedpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pattern = sc.nextInt();
        for (int i = pattern; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
