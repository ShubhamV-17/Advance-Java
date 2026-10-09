public class twosum {
    public static int[] two_sum(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        two_sum(arr, 9);
        System.out.println(two_sum(arr, 9));

    }
}
