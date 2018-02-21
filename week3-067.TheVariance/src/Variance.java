
import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int i = 0;
        int sum = 0;
        while (i < list.size()) {
            sum += list.get(i);
            i++;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double average = (double) sum(list) / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double score = 0;
        double last = 0;
        double average = average(list);
        for (double numbers : list) {
            score = Math.pow(numbers - average, 2);
            last += score;
        }
        return last / (list.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
