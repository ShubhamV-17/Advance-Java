import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            int f = 1;
            for (int j = 1; j <= x; j++) {
                f = f * j;
            }
            System.out.println(f);
        }
    }

}
