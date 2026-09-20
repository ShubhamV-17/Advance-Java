public class maxsubarray {
    public static void printing_maxsubarray(int number[]) {

        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += number[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum : " + maxsum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printing_maxsubarray(number);

    }
}
