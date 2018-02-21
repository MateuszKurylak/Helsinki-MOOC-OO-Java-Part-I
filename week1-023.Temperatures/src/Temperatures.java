
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Put temperature value: ");
            double tempOne = reader.nextDouble();
            if (tempOne >= (-30) && tempOne <= 40) {
                Graph.addNumber(tempOne);
            }
        }
    }
}
