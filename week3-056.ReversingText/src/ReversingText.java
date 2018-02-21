
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String help = "";
        int length = text.length();

        while (length > 0) {
            length--;
            help = help + text.charAt(length);
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
