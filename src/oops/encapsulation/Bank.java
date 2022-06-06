package oops.encapsulation;

public class Bank {

    // private fields
    private int locker;
    private String username = "harsha";
    private String password = "pass";

    // public methods
    void depositAmt(int amount, String username, String password) {

        if (this.username.equals(username) && this.password.equals(password)) {
            this.locker = this.locker + amount;
        }
    }

    void withdrawAmt(int amount, String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            this.locker = this.locker - amount;
        }
    }

    void checkBalance(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Amount in locker: " + this.locker);
        }
    }
}
