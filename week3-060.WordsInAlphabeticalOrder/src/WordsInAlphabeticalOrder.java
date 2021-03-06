
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String newWord = reader.nextLine();
            if (newWord.equals("")) {
                System.out.println("You typed the following words:");
                Collections.sort(names);
                for (String name : names) {
                    System.out.println(name);
                }
                break;
            }
            names.add(newWord);
        }
    }
}
