package assignone;

import java.util.Scanner;

public class AssignmentFactorial {

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long num = sc.nextLong();

        // calls method
        myFactorial(num);
    }

    // factorial of n is the product of all positive descending integers less than n
    // but this doesn't work for much bigger numbers
    static void myFactorial(long n) {
        long fact = 1;

        if (n >= 0) {
            for (long i = 1; i <= n; i++) {
                fact = fact * i; // stores the product
            }
            System.out.println("The factorial of " + n + " is " + fact);
        } else
            System.out.println("Number should be a positive integer");
    }

}
