public class binarytodecimal {
    public static void bintodec(int bin) {
        int mynum = bin;
        int pow = 0;
        int decnum = 0;
        while (bin > 0) {
            int lastdig = bin % 10;
            decnum = decnum + (lastdig * (int) Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        System.out.println("decimal of " + mynum + " = " + decnum);

    }

    public static void main(String[] args) {
        bintodec(1011101);

    }
}
