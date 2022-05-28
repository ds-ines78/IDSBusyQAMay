package loops;

import java.util.Scanner;

public class PatternDemo {

    public static void main(String[] args) {

        System.out.println("-------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row count:");
        int rows = sc.nextInt();
        System.out.println("Please enter column count:");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) { //rows
            if (i % 2 == 0) { // for odd rows
                for (int j = 1; j <= cols; j++) {
                    if (j % 2 == 0) {
                        System.out.print("#");

                    } else
                        System.out.print("*");
                }
            } else { // for even rows
                for (int j = 1; j <= cols; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");

                    } else
                        System.out.print("#");
                }
            }
            System.out.println();
        }

        System.out.println("-------------------");

        System.out.println("Please enter another row count:");
        int myRows = sc.nextInt();

        for (int x = 1; x <= myRows; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}