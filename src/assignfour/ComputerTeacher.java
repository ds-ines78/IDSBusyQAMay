package assignfour;

public class ComputerTeacher extends Teacher {

    private String computerLang = "Java";

    public static void main(String[] args) {
        ComputerTeacher msSmith = new ComputerTeacher();

        msSmith.doesTeaching();
        msSmith.computerClass();
    }

    public void computerClass() {
        System.out.println("I teach " + computerLang);
    }
}
