package arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[4];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        String names[] = {"John", "Mark", "Adam"};

        System.out.println("length is " + a.length);
        System.out.println(a[1]);

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for(int x:b) { // enhanced for loop (stores value from array:array on which we are iterating)
            System.out.println(x);
        }

        for(String newName:names) {
            System.out.println(newName);
        }
    }
}
