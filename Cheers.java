// Prints a crowd cheering output.

public class Cheers {
    public static void main(String[] args) {
        String word = args[0].toUpperCase();
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
