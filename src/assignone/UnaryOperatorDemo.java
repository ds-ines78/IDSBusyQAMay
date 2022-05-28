package assignone;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = --b;
        int d = b++;
        int e = c--;
        int f = ++d;
        int g = e + f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
