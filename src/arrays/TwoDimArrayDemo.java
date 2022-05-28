package arrays;

public class TwoDimArrayDemo {

    public static void main(String[] args) {
        int marks[][] = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int moreMarks[][] = new int[3][3];
        moreMarks[0][0] = 100;
        moreMarks[0][1] = 200;
        moreMarks[0][2] = 300;
        moreMarks[1][0] = 400;
        moreMarks[1][1] = 500;
        moreMarks[1][2] = 600;
        moreMarks[2][0] = 700;
        moreMarks[2][1] = 800;
        moreMarks[2][2] = 900;

        System.out.println(marks[2][1]);

        for (int[] xyz : moreMarks) {
            for (int a : xyz) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        // do same for moreMarks using traditional for loop
        for(int m = 0; m < moreMarks.length ; m++) {
            for(int n = 0; n < moreMarks[m].length; n++) {
                System.out.print(moreMarks[m][n] + " ");
            }
            System.out.println();
        }
    }
}