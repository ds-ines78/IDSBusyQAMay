package assignone;

import java.util.Scanner;

public class AssignmentLeapYear {

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) { // check if year divisible by 4 but not 100
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0) { // check if year divisible by 4
            System.out.println(year + " is a leap year");
        } else // all other conditions
            System.out.println(year + " is NOT a leap year");
    }
}
