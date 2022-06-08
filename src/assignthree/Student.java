package assignthree;

public class Student {
    int sid;
    String sname;
    int sub1, sub2, sub3;

    // constructors
    public Student(int stuid, String stuname, int stusub1, int stusub2, int stusub3) {
        this.sid = stuid;
        this.sname = stuname;
        this.sub1 = stusub1;
        this.sub2 = stusub2;
        this.sub3 = stusub3;
    }

    // methods
    public void getStuData() {
        System.out.println("SID: " + sid);
        System.out.println("Sname: " + sname);
    }

    public void getStuMarks() {
        System.out.println("Student " + sid + " Mark for subject 1: " + sub1);
        System.out.println("Student " + sid + " Mark for subject 2: " + sub2);
        System.out.println("Student " + sid + " Mark for subject 3: " + sub3);
    }

    public void totalMarks() {
        int total = sub1 + sub2 + sub3;
        System.out.println("SID:" + sid + ", " + "Student name:" + sname + ", " + "Total marks: " + total);
    }
}
