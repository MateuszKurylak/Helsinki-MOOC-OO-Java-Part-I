
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int i = 1;
        int sum = 0;
        int number = reader.nextInt();

        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
