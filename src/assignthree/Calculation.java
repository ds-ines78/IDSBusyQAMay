package assignthree;

public class Calculation {

    int num1, num2, num3;
    double doub1, doub2, doub3;

    public void getSum(int newNum1, int newNum2) {
        this.num1 = newNum1;
        this.num2 = newNum2;

        int total = newNum1 + newNum2;

        System.out.println("Sum of two integers is " + total);
    }

    public void getSum(double newDoub1, double newDoub2) {
        this.doub1 = newDoub1;
        this.doub2 = newDoub2;

        double total = doub1 + doub2;

        System.out.println("Sum of two doubles is " + total);
    }

    public void getSum(int newNum1, int newNum2, int newNum3) {
        this.num1 = newNum1;
        this.num2 = newNum2;
        this.num3 = newNum3;

        int total = newNum1 + newNum2 + newNum3;

        System.out.println("Sum of three integers is " + total);
    }

    public void getSum(double newDoub1, double newDoub2, double newDoub3) {
        this.doub1 = newDoub1;
        this.doub2 = newDoub2;
        this.doub3 = newDoub3;

        double total = newDoub1 + newDoub2 + newDoub3;

        System.out.println("Sum of three doubles is " + total);
    }
}
