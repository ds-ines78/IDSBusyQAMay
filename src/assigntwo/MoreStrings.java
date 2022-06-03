package assigntwo;

import java.util.Scanner;

public class MoreStrings {

    public static void main(String[] args) {

        //String palindrome = "Was it a car or a cat I saw?";
        String palindrome = "wowow";
        String firstStrCamel = "Good Morning";
        String firstStrUpper = "GOOD MORNING";
        String firstStrLower = "good morning";
        String secondStr = "BuEnOs dias";
        String thirdStr = "Bonjour MoN AmI";
        String fourthStr = "Hello. My name is Inigo Montoya. You killed my father. Prepare to die.";
        String fifthStr = "    You've got to ask yourself one question: Do I feel lucky? Well, do ya, punk?   ";

        countChar(fourthStr);
        countWords(fifthStr);
        convertIntToStr();
        convertStrToInt();
        removeWhiteSpace(fifthStr);

        if (palindromeCheck(palindrome)) {
            System.out.println("String is a palindrome");
        } else
            System.out.println("String is not a palindrome");
    }

    // count no of times char repeated in string
    public static void countChar(String string1) {

        System.out.println("Original string: " + string1);
        System.out.println("Enter character to count:");
        Scanner sc = new Scanner(System.in);
        char countMe = sc.next(".").charAt(0); // will take only first character from string

        int counter = 0;

        for (int i = 0; i < string1.length(); i++) { // case sensitive
            if (string1.charAt(i) == countMe) {
                counter++;
            }
        }
        System.out.println("Case-sensitive search, character '" + countMe + "' appears " + counter + " time(s)");
        System.out.println();
    }

    // count no of words in sentence
    public static void countWords(String string1) {
        int counter = 1;

        System.out.println("Original string: " + string1);
        string1 = string1.trim(); // remove leading and trailing spaces

        for (int i = 0; i < string1.length() - 1; i++) {
            if ((string1.charAt(i) == ' ') && (string1.charAt(i + 1) != ' ')) { // check for spaces
                counter++;
            }
        }
        System.out.println("Number of words in string: " + counter);
        System.out.println();
    }

    // convert int to string
    public static void convertIntToStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert to string:");
        int num = sc.nextInt();
        System.out.println("Before conversion, add number to 1:");
        System.out.println(num + 1);

        String output = String.valueOf(num);

        System.out.println("After conversion, add string to 1:");
        System.out.println(output + 1);
        System.out.println();
    }

    // convert string to int
    public static void convertStrToInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to integer:");
        String str = sc.next();
        System.out.println("Before conversion, add string to 1:");
        System.out.println(str + 1);

        try {
            int number = Integer.parseInt(str);
            System.out.println("After conversion, add number to 1:");
            System.out.println(number + 1);
            System.out.println();
        } catch (NumberFormatException exc) {
            exc.printStackTrace();
        }
    }

    // remove white spaces from string
    public static void removeWhiteSpace(String string1) {
        System.out.println("Original string: " + string1);

        String newString = string1.replaceAll("\\s", "");

        System.out.println("Output string: " + newString);
        System.out.println();
    }

    // check if string is a palindrome or not
    public static boolean palindromeCheck(String string1) {

        int i = 0; // pointer for beginning of string
        int j = string1.length() - 1; // pointer for end of string

        System.out.println("Original string: " + string1);

        string1 = string1.replaceAll("[^A-Za-z]+", "").toLowerCase(); // remove punctuation
        System.out.println(string1);

        while (i < j) {
            if (string1.charAt(i) != string1.charAt(j)) { // if characters don't match return false
                return false;
            }
            i++;
            j--;
        }
        return true; // otherwise return true
    }
}