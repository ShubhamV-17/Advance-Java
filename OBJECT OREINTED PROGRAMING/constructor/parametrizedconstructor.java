public class parametrizedconstructor {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("shubham");
        student s3 = new student(1);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }

}

class student {
    String name;
    int roll;

    student() {
        System.out.println("constructor is calling");
    }

    student(String name) {
        this.name = name;

    }

    student(int roll) {
        this.roll = roll;

    }
}