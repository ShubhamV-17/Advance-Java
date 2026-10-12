public class characprint {
    public static void printingletter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {
        String firstname = "SHUBHAM";
        String lastname = "VISHWAKARMA";
        String fullname = firstname + " " + lastname;
        printingletter(fullname);
    }
}
