package assignfour;

import java.util.Scanner;

public class Calculation implements Addition, Multiplication {

    @Override
    public void getSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    @Override
    public void getProd(int x, int y) {
        int prod = x * y;
        System.out.println("Product: " + prod);
    }
}
