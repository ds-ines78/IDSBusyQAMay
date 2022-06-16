package collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("string here");
        al.add(new Student(10, 20, 30));

        System.out.println("ArrayList contents: " + al);

        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("abcd");
        hs.add(false);
        hs.add("abcd");
        hs.add(null);
        hs.add(null);
        System.out.println("HashSet contents: " + hs);

    }
}
