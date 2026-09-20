public class pair {
    public static void print_pairs(int numbers[]){
        for(int i= 0; i<numbers.length; i++){
            int current= numbers[i];
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+ current + ","+ numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        print_pairs(number);

    }
}
