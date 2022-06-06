package oops.school;

public class TestStudent {

    public static void main(String[] args) {
        /*Student s1 = new Student();
        s1.printStudentInfo();
        s1.name = "Amrit";
        s1.rollno = 101;
        s1.printStudentInfo();*/

        System.out.println("----------");

        Student s2 = new Student("Ken", 1002, 98, 90);
        s2.printStudentInfo();
        System.out.println("Total marks: " + s2.getTotalMarks());

        Student s3 = new Student("Jack");
        s3.printStudentInfo();
    }
}