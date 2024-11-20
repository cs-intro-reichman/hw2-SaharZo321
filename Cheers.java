// Prints a crowd cheering output.

public class Cheers {
    public static void main(String[] args) {
        String lowercase = "abcdefhijklmnopqrstuvwxyz";
        String word = args[0];
        String upperCase ="";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            upperCase += lowercase.indexOf(c) != -1 ? (char) (c - 32) : c;
        }
        word = upperCase;
        int counter = Integer.parseInt(args[1]);
        String anChars = "AEFHILMNORSX";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (anChars.indexOf(c) != -1) {
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
