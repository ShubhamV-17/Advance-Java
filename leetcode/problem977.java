
import java.util.Arrays;

public class problem977 {
    public static void sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minpos = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minpos] > nums[j]) {
                    minpos = j;
                }
            }

            // swap
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
    }

    public static int[] square(int nums[]) {
        int squares[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        Arrays.sort(squares);
        return squares;
    }

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };

        System.out.println(Arrays.toString(square(nums)));
    }
}
