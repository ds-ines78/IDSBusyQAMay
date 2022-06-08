package assignthree;

import java.util.Scanner;

public class MyTestCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int newNum1 = sc.nextInt();
        System.out.println("Enter second number");
        int newNum2 = sc.nextInt();
        System.out.println("Enter third number");
        int newNum3 = sc.nextInt();
        System.out.println("Enter first double");
        double newDoub1 = sc.nextDouble();
        System.out.println("Enter second double");
        double newDoub2 = sc.nextDouble();
        System.out.println("Enter third double");
        double newDoub3 = sc.nextDouble();

        Calculation cal = new Calculation();
        cal.getSum(newNum1, newNum2);
        cal.getSum(newNum1, newNum2, newNum3);
        cal.getSum(newDoub1, newDoub2);
        cal.getSum(newDoub1, newDoub2, newDoub3);
    }
}
