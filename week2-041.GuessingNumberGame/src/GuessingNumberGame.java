
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessesMade = 1;
        while (numberDrawn == numberDrawn) {
            System.out.print("Guess a number: ");
            int number = reader.nextInt();
            if (number == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (number > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guessesMade);
            } else if (number < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guessesMade);
            }
            guessesMade++;
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
