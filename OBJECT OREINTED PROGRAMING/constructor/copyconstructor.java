public class copyconstructor {
    public static void main(String[] args) {

        student s1 = new student();

        s1.name = "shubham";
        s1.roll = 456;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 50;
        s1.marks[2] = 20;

        student s2 = new student(s1);

        s2.password = "xyz";

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class student {
    String name;
    int roll;
    String password;
    int marks[];

    // Default constructor
    student() {
        marks = new int[3];
        System.out.println("constructor is calling");
    }

    // Copy constructor (Deep Copy)
    student(student s1) {
        marks = new int[3];

        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;

        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    student(String name) {
        this.name = name;
        marks = new int[3];
    }

    student(int roll) {
        this.roll = roll;
        marks = new int[3];
    }
}
