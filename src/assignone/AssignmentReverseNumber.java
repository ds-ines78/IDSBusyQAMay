package assignone;

import java.util.Scanner;

public class AssignmentReverseNumber {

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int reversed = 0; // to hold digits being reversed

        while(number != 0) {
            int remainder = number % 10; // gets remainder
            reversed = reversed * 10 + remainder;
            number = number / 10; // removes last digit from number
        }

        System.out.println("Your number reversed is " + reversed);
    }
}
