
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int factorial = 1;
        int sum = 1;
        int i = 1;

        if (number == 0) {
            System.out.println("Factorial is 1");
        } else {
            while (i <= number) {
                sum = sum * factorial;
                factorial++;
                i++;
            }
            System.out.println("Factorial is " + sum);
        }
    }
}
