public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolour("blue");
        System.out.println(p1.color);

        p1.settip(5);
        System.out.println(p1.tip);
    }
}

class pen {
    String color;
    int tip;

    void setcolour(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }

}