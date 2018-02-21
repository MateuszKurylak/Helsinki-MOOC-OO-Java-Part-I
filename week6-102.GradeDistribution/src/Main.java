
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes:");
        Grades grades = new Grades();

        int typed = 0;
        while (typed != -1) {
            typed = lukija.nextInt();
            grades.add(typed);
        }
        System.out.println("Grade distribution");
        grades.printGrades();
        System.out.print("Acceptance percentage: " + grades.acceptance());        // do not put all to one method/class but rather design a proper structure to your program
    }
}
