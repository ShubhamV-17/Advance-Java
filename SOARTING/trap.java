public class trap {

    public static int trap_ing(int height[]) {

        // Left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Right max boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // Calculate trapped water
        int trapedwater = 0;

        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapedwater += waterlevel - height[i];
        }

        return trapedwater;
    }

    public static void main(String[] args) {

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(trap_ing(height));
    }
}