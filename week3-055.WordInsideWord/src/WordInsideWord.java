
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type first word: ");
        String wordOne = reader.nextLine();
        System.out.print("Type second word: ");
        String wordTwo = reader.nextLine();

        int index = wordOne.indexOf(wordTwo);

        if (index >= 0) {
            System.out.println("The word '" + wordTwo + "' is found in the word '" + wordOne + "'.");
        } else {
            System.out.println("The word '" + wordTwo + "' is not found in the word '" + wordOne + "'.");
        }
    }
}
