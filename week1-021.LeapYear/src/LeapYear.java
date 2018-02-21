import java.util.Scanner;
 
public class LeapYear {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = reader.nextInt();
        int divisable = year % 4;
        int hundreds = year % 100;
        int x = year % 400;
 
        if (divisable == 0 && hundreds !=0 || x==0) {
            System.out.println("\nThis year is a leap year");
        } else {
            System.out.println("\nThe year is not a leap year.");
        }
    }
}