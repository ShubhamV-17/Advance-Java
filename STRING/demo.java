import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c' };
        String str = "abcd";
        String str2 = new String("xyz");

        // strings are IMMUTABLE
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        String fullname = "tony stark";
        System.out.println(fullname.length());

    }
}
