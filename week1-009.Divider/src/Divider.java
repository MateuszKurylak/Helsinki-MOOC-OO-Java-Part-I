
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number:");
        int numOne = reader.nextInt();
        System.out.print("Type another number: ");
        int numTwo = reader.nextInt();

        System.out.println("Division: " + numOne + " / " + numTwo + " = " + (double) numOne / numTwo);
    }
}
