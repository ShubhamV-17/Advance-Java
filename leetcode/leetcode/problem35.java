public class problem35 {
    public static void searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
                return;
            }
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        searchInsert(nums, 5);

    }

}
