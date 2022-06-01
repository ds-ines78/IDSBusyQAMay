package assigntwo;

public class TwoDimArray {

    public static void main(String[] args) {

        int marks[][] = {
                {68, 70, 80},
                {70, 82, 90}
        };

        int first[][] = {
                {10, 20, 30},
                {30, 40, 50}
        };
        int second[][] = {
                {50, 60, 70},
                {70, 80, 90}
        };

        double avg;
        int rowTotal = 0;
        int rows = 2; // change
        int columns = 3; // change
        int[][] sum = new int[rows][columns]; // sum matrix will hold sum of first matrix + second matrix

        System.out.println("Test results are:");
        for (int[] xyz : marks) {
            for (int a : xyz) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                rowTotal += marks[row][col];
            }

            avg = rowTotal / marks[row].length; // calc average
            System.out.println("Average grade: " + avg); // print the row average
            rowTotal = 0; // start over (for next row)
        }

        System.out.println("-------------------");
        System.out.println("-------------------");

        System.out.println("Matrix 1:");
        for (int[] xyz : first) {
            for (int a : xyz) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int[] xyz : second) {
            for (int a : xyz) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        // get sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        // display sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("The sum of the matrices is: " + sum[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
