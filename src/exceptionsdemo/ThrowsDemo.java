package exceptionsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

/*    public static void divideByZero() throws ArithmeticException {
        System.out.println(10 / 0);
    }*/

    public static void fileHandle() throws FileNotFoundException {
        File f = new File("abcd.txt");
        FileInputStream fis = new FileInputStream(f);
    }

    public static void main(String[] args) throws FileNotFoundException {
        //ThrowsDemo.divideByZero();
        fileHandle();
    }
}
