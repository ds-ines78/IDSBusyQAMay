package oops.inheritance;

public class TestDaughter {

    public static void main(String[] args) {
        Daughter dear = new Daughter();
        dear.running();
        dear.sports();
        dear.getJob();

        dear.setJob("tester");
        dear.setValue("100kg");
        dear.setBusiness("development");
        System.out.println(dear);
    }
}
