package assignone;

import java.util.Scanner;

public class AssignmentDaysInMonth {

    int number;

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month, such as '1' for Jan, '2' for Feb,etc.:");
        int month = sc.nextInt();

        switch (month) {
            case 4, 6, 9, 11 -> System.out.println("This month has 30 days");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("This month has 31 days");
            case 2 -> System.out.println(("This month has 28 or 29 days"));
            default -> System.out.println("Please enter a valid number");
        }
    }
}
