package assignone;

import java.util.Scanner;

public class AssignmentMultiplicationTable {

    public static void main(String[] args) {

        // creates new Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Multiplication table for " + num);

        for (int i = 1; i < 21; i++) {
            System.out.println(i * num);
        }
    }
}
