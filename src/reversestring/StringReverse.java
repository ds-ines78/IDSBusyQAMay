package reversestring;

public class StringReverse {

    public static void main(String[] args) {

        String word = "was it a cat i saw";
        System.out.println("Original string: " + word);

        char[] word_charray = word.toCharArray(); // convert string to char array

        for(int i = 0; i < word_charray.length/2; i++) { // loop over char array
            /*char a = word_charray[i]; // get char from start of char array
            char b = word_charray[word_charray.length-i-1]; // get char from end*/
            //char c = '0';
            // need to swap positions
            char c = word_charray[i]; // c = a;
            word_charray[i] = word_charray[word_charray.length-i-1]; // a = b;
            word_charray[word_charray.length-i-1] = c; // b = c;
        }
        System.out.println("Reversed string: " + String.copyValueOf(word_charray));
    }
}
