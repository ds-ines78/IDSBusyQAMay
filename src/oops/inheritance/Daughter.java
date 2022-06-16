package oops.inheritance;

public class Daughter extends Parent {

    private String job;

    void sports() {
        System.out.println("i love baseball");
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "job: " + job + "\nvalue: " + this.getValue() + "\nbusiness: " + this.getBusiness();
    }
}
