package bankproject;

public class Bank {

    int balance;
    String username;
    String password;

    Bank(int balance, String username, String password) {
        this.balance = balance;
        this.username = username;
        this.password = password;
    }

    public void printBalance(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println(this.balance);
        } else {
            throw new InvalidCredentialsException("please enter valid credentials");
        }
    }
}
