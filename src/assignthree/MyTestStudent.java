package assignthree;

import java.util.Scanner;

public class MyTestStudent {

    public static void main(String[] args) {

        Student stu1 = new Student(1200, "Sarah", 90, 94, 98);
        Student stu2 = new Student(1205, "Kiya", 89, 95, 92);
        Student stu3 = new Student(1315, "Jackson", 86, 98, 98);

        stu1.getStuData();
        stu1.getStuMarks();
        stu1.totalMarks();

        stu2.totalMarks();
    }
}
