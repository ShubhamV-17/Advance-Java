public class binary {
    public static int binary_search(int marks[], int key) {
        int start = 0;
        int end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison\
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] < key) {
                start = mid + 1;
            }
            if (marks[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 14;
        System.out.println("index for key is : " + binary_search(marks, key));
        System.out.println(marks.length);
    }
}
