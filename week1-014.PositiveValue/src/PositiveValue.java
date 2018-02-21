import java.util.Scanner;
 
public class PositiveValue {
 
    public static void main(String[] args) {
 
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
 
        double number = reader.nextDouble();
 
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is not positive");
        } else {
            System.out.println("is not positive");
        }
    }
}