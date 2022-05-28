package assignone;

import java.util.Scanner;

public class AssignmentGreatestOf3 {

    static int largest;

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);

        // get numbers entered by user
        System.out.println("Please enter the 1st number:");
        int first = sc.nextInt();

        System.out.println("Please enter the 2nd number:");
        int second = sc.nextInt();

        System.out.println("Please enter the 3rd number:");
        int third = sc.nextInt();

        // calls largestOfThree method
        largest = largestOfThree(first, second, third);

        // prints largest number
         System.out.println(largest + " is the largest number");
    }

    static int largestOfThree(int a, int b, int c) {

        // compare three numbers
        if (a > b && a > c) {
            return a;
        } else if (a > b && a < c) {
            return c;
        } else if (a < b && b > c) {
            return b;
        } else
            return c;
    }
}