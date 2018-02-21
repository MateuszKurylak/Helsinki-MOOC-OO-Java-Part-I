import java.util.ArrayList;
import java.util.Scanner;
 
public class Words {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        words.add(word);
 
        while (!word.isEmpty()) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        System.out.println("You typed the following words:");
        for (String wordPressed : words) {
            System.out.println(wordPressed);
        }
    }
}