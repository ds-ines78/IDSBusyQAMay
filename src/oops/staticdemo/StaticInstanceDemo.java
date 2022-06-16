package oops.staticdemo;

public class StaticInstanceDemo {

    public static String stove; // common to all objects
    public String bedlight;

    public String name;

    public static String clgName;

    public StaticInstanceDemo(String name) {
        System.out.println("I am inside a const");
        this.name = name;
    }

    static {
        System.out.println("I am inside a static block");
        clgName = "ABC College";
    }

    public static void staticMethod() {
        System.out.println("i am inside a static method");
    }

    public void instMethod() {
        System.out.println("i am inside an instance method");
    }

}
