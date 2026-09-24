public class reverse {

    public static int reverse_karo(int marks[]) {
        int first = 0, last = marks.length - 1;
        while (first < last) {
            int temp = marks[last];
            marks[last] = marks[first];
            marks[first] = temp;

            first++;
            last--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        reverse_karo(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
