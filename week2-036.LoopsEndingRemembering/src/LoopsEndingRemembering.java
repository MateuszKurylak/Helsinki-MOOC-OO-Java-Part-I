
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int numbers = reader.nextInt();
        int sum = 0;
        int howMany = 0;
        double average = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (numbers != -1) {
            int evenOrOdd = numbers % 2;
            if (evenOrOdd == 0) {
                evenCount++;
            }
            if (evenOrOdd == 1) {
                oddCount++;
            }
            sum = numbers + sum;
            numbers = reader.nextInt();
            howMany++;
            average = (double) sum / howMany;
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + howMany);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
