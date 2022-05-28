package assignone;

public class AssignmentHelloSumSwap {

    public static void main(String[] args) {

        int x = 4;
        int y = 36;
        int a = 10;
        int b = 20;
        int c;

        // print "Hello" on screen then print your name on separate line
        System.out.println("Exercise #1");
        System.out.println("Hello");
        System.out.println("Ines");

        // print sum of two numbers
        System.out.println("Exercise #2");
        System.out.println(x + y);

        // swap two numbers
        System.out.println("Exercise #3");
        System.out.println("before swap:");
        System.out.println(a);
        System.out.println(b);

        c = b;
        b = a;
        a = c;

        System.out.println("after swap:");
        System.out.println(a);
        System.out.println(b);

    }
}
