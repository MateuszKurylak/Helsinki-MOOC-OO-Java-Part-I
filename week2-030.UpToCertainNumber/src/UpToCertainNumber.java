
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int number = reader.nextInt();
        int one = 1;

        while (one <= number) {
            System.out.println(one);
            one++;
        }
    }
}
