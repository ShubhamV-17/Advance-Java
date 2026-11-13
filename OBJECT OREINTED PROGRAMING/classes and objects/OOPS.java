public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolour("blue");
        System.out.println(p1.getcolor());

        p1.settip(5);
        System.out.println(p1.gettip());
        p1.setcolour("yellow");
        System.out.println(p1.getcolor());
    }
}

class pen {
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setcolour(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }

}