
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String name;
        String number;
        String search;

        while (true) {
            System.out.print("name: ");
            name = scan.nextLine();
            if (!name.equals("")) {
                System.out.print("studentnumber: ");
                number = scan.nextLine();
                Student allStudents = new Student(name, number);
                list.add(allStudents);
            } else {
                break;
            }
        }
        System.out.println("");
        for (Student element : list) {
            System.out.println(element);
        }
        System.out.println("");
        System.out.print("Give search term: ");
        search = scan.nextLine();
        System.out.println("Result:");

        for (Student lista : list) {
            if (lista.getName().contains(search)) {
                System.out.println(lista);
            }
        }
    }
}
