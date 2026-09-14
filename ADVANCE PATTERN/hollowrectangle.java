public class hollowrectangle {

    public static void hollow_rectangle(int totRow, int totcols) {

        // outer loop
        for (int i = 1; i <= totRow; i++) {

            // inner loop
            for (int j = 1; j <= totcols; j++) {

                // boundary cells
                if (i == 1 || i == totRow || j == 1 || j == totcols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(10, 7);
    }
}
