import java.util.Scanner;
import java.util.stream.IntStream;
 
public class GradesAndPoints {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int points = reader.nextInt();
 
        while (points >= 0 && points <= 29) {
            System.out.println("Grade: failed");
            break;
        }
         while (points >= 30 && points <= 34) {
            System.out.println("\nGrade: 1");
            break;
        }
         while (points >= 35 && points <= 39) {
            System.out.println("\nGrade: 2");
            break;
        }
         while (points >= 40 && points <= 44) {
            System.out.println("\nGrade: 3");
            break;
        }
         while (points >= 45 && points <= 49) {
            System.out.println("\nGrade: 4");
            break;
        }
         while (points >= 50 && points <= 60) {
            System.out.println("\nGrade: 5");
            break;
        }
    }
}