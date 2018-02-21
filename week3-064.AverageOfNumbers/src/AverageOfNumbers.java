
import java.util.ArrayList;

public class AverageOfNumbers {

    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        for (int sum : list) {
            i += sum;
        }
        return i;
    }

    public static double average(ArrayList<Integer> list) {
        double average = (double) sum(list) / list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average is: " + average(list));
    }
}
