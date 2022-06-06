package oops.encapsulation;

public class TestBank {

    public static void main(String[] args) {
        Bank abc = new Bank();
        abc.depositAmt(1000, "harsha", "pass");
        abc.checkBalance("harsha", "pass");
        abc.withdrawAmt(50, "harsha", "pass");
        abc.checkBalance("harsha", "pass");
    }
}
