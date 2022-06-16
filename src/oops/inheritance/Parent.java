package oops.inheritance;

public class Parent {

    private String value = "100kg";
    private String business = "Mining";

    void running() {
        System.out.println("can run at 10km at a stretch");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "value: " + this.value + "\n business: " + this.business;
    }
}
