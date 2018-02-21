
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int count = name.length();
        int i = 0;
        while (i < count) {
            System.out.println(i + 1 + ". character: " + name.charAt(i));
            i++;
        }
    }
}
