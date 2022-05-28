package assignone;

import java.util.Scanner;

public class AssignmentPosNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creates new Scanner object

        System.out.println("Please enter an integer:");

        double number = sc.nextDouble(); // gets the number entered by user
        System.out.println("You entered " + number); // prints user's input

        if(number >= 0) {
            System.out.println(number + " is a POSITIVE number");
        } else
            System.out.println(number + " is a NEGATIVE number");
    }
}
