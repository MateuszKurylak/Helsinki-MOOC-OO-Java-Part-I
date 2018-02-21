import java.util.Scanner;
 
public class GreaterNumber {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int numberOne = reader.nextInt();
        System.out.print("Type the second number: ");
        int numberTwo = reader.nextInt();
        System.out.println("");
 
        if (numberOne == numberTwo) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number : " + Math.max(numberOne, numberTwo));
        }
    }
}