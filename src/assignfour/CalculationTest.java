package assignfour;

import java.util.Scanner;

public class CalculationTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to add: ");
        int firstAdd = sc.nextInt();
        System.out.println("Enter second number to add: ");
        int secondAdd = sc.nextInt();
        System.out.println("Enter first number to multiply: ");
        int firstMult = sc.nextInt();
        System.out.println("Enter second number to multiply: ");
        int secondMult = sc.nextInt();

        Calculation myCalc = new Calculation();
        myCalc.getSum(firstAdd, secondAdd);
        myCalc.getProd(firstMult, secondMult);
    }
}
