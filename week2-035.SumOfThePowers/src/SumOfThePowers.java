
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int i = 0;
        int power = 0;

        while (i <= number) {
            power = (int) Math.pow(2, i);
            power += power - 1;
            i++;
        }
        System.out.println("The result is " + power);
    }
}
