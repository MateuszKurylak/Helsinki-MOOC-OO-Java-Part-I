
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String help = "";
        int length = text.length();
        while (length > 0) {
            length--;
            help = help + text.charAt(length);
        }
        if (text.equals(help)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
