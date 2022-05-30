package assigntwo;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    // Given Array: array = {1,2,3,4,8,9,14}

    public static void main(String[] args) {
        int array[] = {1, 2, 2, 3, 4, 8, 9, 14};

        sumOfValues(array);
        avgOfValues(array);
        printOddEven(array);
        findMissingElement(array);
        smallGreat(array);
        findDup(array);
    }

    // calculate sum of values in array
    public static void sumOfValues(int[] intArray) {
        int sum = 0;

        System.out.println("Original array:");
        for (int x : intArray) {
            System.out.print(x + " ");
        }
        for (int i : intArray) {
            sum = i + sum;
        }
        System.out.println("\n");
        System.out.println("\n" + "Sum of values in array is:");
        System.out.println(sum);
    }

    // calculate average of values in array
    public static void avgOfValues(int[] intArray) {
        int sum = 0;
        int avg = 0;

        for (int i : intArray) {
            sum = i + sum;
            avg = sum / intArray.length;
        }
        System.out.println("\n" + "Average of values in array is:");
        System.out.println(avg);
    }

    // print even and odd numbers in array
    public static void printOddEven(int[] intArray) {
        System.out.println("\n" + "Odd numbers in array:");
        for (int x : intArray) {
            if (x % 2 == 1) { // get odd numbers
                System.out.print(x + " ");
            }
        }
        System.out.println("\n" + "Even numbers in array:");
        for (int x : intArray) {
            if (x % 2 == 0) { // get even numbers
                System.out.print(x + " ");
            }
        }
    }

    // find missing number in array
    public static void findMissingElement(int[] intArray) {
        Scanner sc = new Scanner(System.in);

        // get number entered by user
        System.out.println("\n");
        System.out.println("\n" + "ENTER index # of item to remove:");
        int index = sc.nextInt();

        ArrayList<Integer> newArray = new ArrayList<>();

        for (int x : intArray) {
            newArray.add(x);
        }
        int z = newArray.remove(index);

        System.out.println("Array before deletion: ");
        for (int y : intArray) {
            System.out.print(y + " ");
        }
        System.out.println("\n" + "Array after deletion: " + newArray);
        System.out.println("Value removed: " + z);
    }

    // find greatest and smallest values
    public static void smallGreat(int[] intArray) {
        int greatest = intArray[0];
        int smallest = intArray[0];

        for (int x = 1; x < intArray.length; x++) {
            if (intArray[x] > greatest) {
                greatest = intArray[x];
            } else if (intArray[x] < smallest) {
                smallest = intArray[x];
            }
        }
        System.out.println("\n");
        System.out.println("Smallest value: " + smallest);
        System.out.println("Greatest value: " + greatest);
    }

    // find duplicate elements
    public static void findDup(int[] intArray) {
        for (int x = 0; x < intArray.length; x++) { // gets value from 1st array
            for (int y = x + 1; y < intArray.length; y++) { // compares values in 2nd array to x
                if (intArray[x] == intArray[y]) {
                    System.out.println("Duplicate value: " + intArray[y]);
                }
            }
        }
    }
}