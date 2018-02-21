
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
        int sum = 0;
        System.out.print("First: ");
        int firstNum = reader.nextInt();
        System.out.print("Last: ");
        int lastNum = reader.nextInt();

        while (firstNum <= lastNum) {
            sum += firstNum;
            firstNum++;
        }
        System.out.print("The sum is " + sum);
    }
}
