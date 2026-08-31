import java.util.*;

public class starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pattern = sc.nextInt();
        System.out.println("pattern is : " + pattern);
        for (int i = 0; i <= pattern; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
