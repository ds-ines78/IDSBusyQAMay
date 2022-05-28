package loops;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row count:");
        int rows = sc.nextInt();
        System.out.println("Please enter column count:");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i % 2 == 0) {
                    System.out.print("#"); // will print * for odd no lines
                } else
                    System.out.print("*"); // will print # for even no lines
            }
            System.out.println();
        }
    }
}