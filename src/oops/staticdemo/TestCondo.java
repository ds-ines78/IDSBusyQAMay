package oops.staticdemo;

import java.util.concurrent.Callable;

public class TestCondo {

    public static void main(String[] args) {
        /*Condo c1 = new Condo();
        c1.bedlight = "light blue";
        c1.stove = "ON";
        System.out.println("bedlight: " + c1.bedlight);
        System.out.println("stove: " + c1.stove);

        Condo c2 = new Condo();
        c2.stove = "OFF";
        System.out.println("bedlight: " + c2.bedlight);
        System.out.println("stove: " + c2.stove);

        System.out.println("stove: " + c1.stove);*/

        StaticInstanceDemo sid = new StaticInstanceDemo("harsha");
        System.out.println(StaticInstanceDemo.clgName);

    }
}
