import java.util.Scanner;
 
public class EvenOrOdd {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int evenOrOdd = number % 2;
        if (evenOrOdd == 1) {
            System.out.println("Number " + number + " is odd");
        } else if (evenOrOdd == -1) {
            System.out.println("Number " + number + " is odd");
        } else if (evenOrOdd == 0) {
            System.out.println("Number " + number + " is even");
        }
    }
}