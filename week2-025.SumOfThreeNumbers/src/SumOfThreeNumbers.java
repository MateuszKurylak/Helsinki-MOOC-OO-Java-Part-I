
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.print("Type first number: ");
        int read = reader.nextInt();
        sum = read;
        System.out.print("Type second number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.print("Type third number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Sum: " + sum);
    }
}
