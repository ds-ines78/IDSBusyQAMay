package collectionsdemo;

public class Student {

    int math;
    int phy;
    int che;

    Student(int math, int phy, int che) {
        System.out.println("Student values: " + math + phy + che);
    }

    public double getAvg() {
        double avg = (this.math + this.phy + this.che) / 3;
        return avg;
    }

    @Override
    public String toString() {
        return "math " + math + " phy " + phy + " che " + che;
        }
    }
