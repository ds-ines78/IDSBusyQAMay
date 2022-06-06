package asciidemo;

public class CharacterCount {

    public static void main(String[] args) {
        String sentence = "learn java programming with me";
        int count[] = new int[128]; // counter array, in ascending order

        for (int i = 0; i < sentence.length(); i++) { // length of a string
            char ch = sentence.charAt(i); // get character from string
            int ascii = ch; // convert character to integer
            count[ascii]++; // to count number of occurrences of character
        }

        for (int i = 0; i < count.length; i++) { // length of an array
            if (count[i] != 0) {
                char ch = (char) i; // convert integer to character, casting
                int c = count[i];
                System.out.println(ch + " : " + c); // this also includes count of empty spaces
            }
        }
    }
}