package assignone;

public class AssignmentFibonacci {

    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z;
        int limit = 10; // to finish at 34

        for (int i = 1; i <= limit; ++i) {

            // to compute the series
            System.out.print(x + " ");
            z = x + y;
            x = y;
            y = z;

        }
    }
}

