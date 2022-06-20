package assignfive;

public class UncheckedExcepTryCatch {

    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        int arr[] = null;
        int arr2[] = {1, 2, 3, 4, 5};

        try {
            System.out.println("Result of division: " + a/b); // risky code
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide a number by zero"); // recovery code
        }

        try {
            System.out.println("Length of array: " + arr.length);
        } catch (NullPointerException e) {
            System.out.println("The array is null");
        }

        try {
            System.out.println("Array item 7: " + arr2[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        } finally {
            System.out.println("Finished");
        }

        System.out.println("I am safe");
    }
}

