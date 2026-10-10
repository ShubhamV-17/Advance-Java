public class problem1295 {
    public static int findNumbers(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digit = 0;

            while (num > 0) {
                digit++;
                num = num / 10;
            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));

    }
}
