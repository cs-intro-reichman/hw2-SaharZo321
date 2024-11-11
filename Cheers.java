// Prints a crowd cheering output.

import java.util.HashSet;

public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
        int counter = Integer.parseInt(args[1]);
        char[] anCharsArray = { 'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X' };
        var anCharsSet = new HashSet<Character>();

        for (char c : anCharsArray) {
            anCharsSet.add(c);
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (anCharsSet.contains(c)) {
                System.out.printf("Give me an %c: %c!\n", c, c);
            } else {
                System.out.printf("Give me a  %c: %c!\n", c, c);
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < counter; i++) {
            System.out.printf("%s!!!\n", word);
        }
    }
}
