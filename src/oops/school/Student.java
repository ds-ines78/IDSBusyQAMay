package oops.school;

public class Student {

    String name;
    int rollno;
    int math_marks;
    int cs_marks;

    // constructor for the class
    Student(String sname, int sroll, int smathm, int scsm) {
        name = sname;
        rollno = sroll;
        math_marks = smathm;
        cs_marks = scsm;
    }

    // constructor overloading
    Student(String sname) {
        name = sname;
    }

    // methods
    int getTotalMarks() {
        return math_marks + cs_marks;
    }

    void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollno);
    }
}
