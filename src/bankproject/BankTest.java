package bankproject;

public class BankTest {
    public static void main(String[] args) {
        Bank b = new Bank(1000, "Ines", "password");

        b.printBalance("Ines", "pass12321word");
    }
}
