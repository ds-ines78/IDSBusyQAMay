package assignone;

import java.util.Scanner;

public class AssignmentNumberPalindrome {

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        long number = sc.nextLong();
        long reversed = 0; // to hold digits being reversed
        long remainder; // to hold remainder

        long origNumber = number; // will use this later for comparison

        while (number != 0) {
            remainder = number % 10; // gets remainder
            reversed = reversed * 10 + remainder;
            number = number / 10; // removes last digit from number
        }

        System.out.println("Your number reversed is " + reversed);

        if (origNumber == reversed) { // checks if digits are the same and same order
            System.out.println("Your number and its reverse are palindromes");
        } else
            System.out.println("Your number and its reverse are NOT palindromes");
    }
}

