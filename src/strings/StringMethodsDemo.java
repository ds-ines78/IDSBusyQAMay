package strings;

import java.util.Locale;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "ines";
        String name2 = "Ines";
        String name3 = "Ines Stanley";
        String name4 = "Ken";

        System.out.println(name.length());
        System.out.println(name.charAt(2));

        boolean flag = name.contains("ni");
        System.out.println(flag);

        System.out.println(name.equalsIgnoreCase(name2)); // true
        System.out.println(name.equals(name2)); // false

        String[] names = name3.split(" ");
        for(String x:names) {
            System.out.println(x);
        }

        String[] moreNames = name3.split("s");
        for(String x:moreNames) {
            System.out.println(x);
        }

        System.out.println(name.concat(name4));

        String data = "    good morning   ";
        System.out.println(data.trim()); // removes starting and ending spaces

        String listing = "MLS12345 Whitby";
        String newListing = listing.replace("Whitby", "Oshawa");
        System.out.println(newListing);

        String ajaxListing = "MLS123412 Ajax";
        String updAjListing = ajaxListing.substring(5,10); // extracts section of string
        System.out.println(updAjListing);
    }
}
