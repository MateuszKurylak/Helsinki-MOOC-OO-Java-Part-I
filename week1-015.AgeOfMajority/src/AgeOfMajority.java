
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = reader.nextInt();

        if (age >= 18) {
            System.out.println("You have reached the age of majority!");
            if (age > 150) {
                System.out.println("But you are probably dead");
            }
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
