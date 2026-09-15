public class trianglr {
    public static void trin_gular(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        trin_gular(5);
    }
}
