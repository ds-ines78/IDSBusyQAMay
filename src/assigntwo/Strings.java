package assigntwo;

public class Strings {

    public static void main(String[] args) {

        String firstStrCamel = "Good Morning";
        String firstStrUpper = "GOOD MORNING";
        String firstStrLower = "good morning";
        String secondStr = "BuEnOs dias";
        String thirdStr = "Bonjour MoN AmI";
        String fourthStr = "Hello. My name is Inigo Montoya. You killed my father. Prepare to die.";

        stringComparison(firstStrUpper, firstStrLower);
        concatString(firstStrCamel, secondStr);
        getStrLength(thirdStr);
        getSubstring(fourthStr);
        convertToUpperCase(fourthStr);
        convertToLowerCase(fourthStr);
        reverseString(thirdStr);

    }

    public static void stringComparison(String string1, String string2) {
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        int res = string1.compareToIgnoreCase(string2);

        if (res == 0) {
            System.out.println("The first string is equal to the other string");
            System.out.println();
        } else {
            System.out.println("The strings are not equal");
            System.out.println();
        }
    }

    public static void concatString(String string1, String string2) {
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        System.out.println(string1 + " " + string2);
        System.out.println();
    }

    public static void getStrLength(String string1) {
        System.out.println("Original string: " + string1);

        System.out.println("Length is: " + string1.length());
        System.out.println();
    }

    public static void getSubstring(String string1) {
        System.out.println("Original string: " + string1);

        System.out.println("Substring starting from index 5 and ending at 15: " + string1.substring(5, 15));
        System.out.println();
    }

    public static void convertToUpperCase(String string1) {
        System.out.println("Original string: " + string1);

        System.out.println("In uppercase: " + string1.toUpperCase());
        System.out.println();
    }

    public static void convertToLowerCase(String string1) {
        System.out.println("Original string: " + string1);

        System.out.println("In lowercase: " + string1.toLowerCase());
        System.out.println();
    }

    public static void reverseString(String string1) {
        String reverse = " ";
        char ch;
        StringBuilder input = new StringBuilder();

        System.out.println("Original string: " + string1);

        // first approach
        for (int i = 0; i < string1.length(); i++) {
            ch = string1.charAt(i); // extracts each character while traversing
            reverse = ch + reverse;
        }
        System.out.println("FOR Loop - Reversed string: " + reverse);

        // second approach
        input.append(string1);
        input.reverse();
        System.out.println("StringBuilder - Reversed string: " + input);
    }
}