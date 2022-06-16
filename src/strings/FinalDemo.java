package strings;

public class FinalDemo {

    public static void main(String[] args) {
        final Student s = new Student();
        System.out.println(s.marks);
        s.marks = 47;
        System.out.println(s.marks);
    }
}
