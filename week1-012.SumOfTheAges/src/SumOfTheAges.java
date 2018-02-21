
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nameOne = reader.next();

        System.out.print("Type your age: ");
        int ageOne = reader.nextInt();

        System.out.println("");

        System.out.print("Type your name: ");
        String nameTwo = reader.next();

        System.out.print("Type your age: ");
        int ageTwo = reader.nextInt();

        System.out.println("");

        System.out.println(nameOne + " and " + nameTwo + " are " + (ageOne + ageTwo) + " old in total");
    }
}
