package strings;

public class StringsDemo {

    public static void main(String[] args) {
        String name1 = "Ines"; // string literal
        String name2 = "Ines";
        String town = new String("Ines"); // string object

        String color = "white";
        String color2 = "white";
        String color3 = new String("white");
        String color4 = new String("white");
        String color5 = color2;
        String color6 = color4;

        //System.out.println(name1==name2); // should be true
        //System.out.println(name2.equals(town)); // should be true

        System.out.println(color == color6);
        System.out.println(color3 == color4);
        System.out.println(color5 == color6);

        System.out.println("-------------------");

        String a = new String("red");
        String b = a;
        String c = "red";

        System.out.println(a == b);
        System.out.println(c == b);
        System.out.println(a == c);
    }
}
