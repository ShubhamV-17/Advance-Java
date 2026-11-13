public class demo {
    public static void main(String[] args) {
        bankAccount myAccount = new bankAccount();
        myAccount.username = "SHUBHAM VISHWAKARMA";
        myAccount.setPassword("abcdefghij");
    }
}

class bankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
