import java.util.Scanner;

public class forlooppattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter th number:");
        int n = sc.nextInt();
        for (int lines = 1; lines <= n; lines++) {
            System.out.println("* * * *");
        }

        int line = 1;
        while (line <= 4) {
            System.out.println("* * * *");
            line++;
        }
    }
}
