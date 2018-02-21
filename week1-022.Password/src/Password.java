
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String typedPass = reader.nextLine();

            if (password.equals(typedPass)) {
                System.out.println("Right!");
                System.out.println("\nThe secret is: wnin cebtenzzre!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
