public class spiral {

    public static void printingspiral(int matrix[][]) {

        int startRow = 0;
        int startCol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startRow <= endrow && startCol <= endcol) {

            // Top boundary
            for (int j = startCol; j <= endcol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right boundary
            for (int i = startRow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            // Bottom boundary
            for (int j = endcol - 1; j >= startCol; j--) {
                if (startRow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            // Left boundary
            for (int i = endrow - 1; i >= startRow + 1; i--) {
                if (startCol == endcol) {
                    return;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // Move boundaries
            startRow++;
            startCol++;
            endrow--;
            endcol--;
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printingspiral(matrix);
    }
}
