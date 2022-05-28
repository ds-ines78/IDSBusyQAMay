package assignone;

import java.util.Scanner;

public class AssignmentNumberOfDigits {

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int myCount = 0; // counter for number of digits

        while(num != 0) {
            num = num / 10; // to remove last digit from number
            myCount++; // to run loop again on remaining digits
        }

        System.out.println("The number has " + myCount + " digits");
    }
}
