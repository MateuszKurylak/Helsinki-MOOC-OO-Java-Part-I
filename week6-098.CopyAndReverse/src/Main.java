
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int helper[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            helper[i] = array[i];
        }
        return helper;
    }

    public static int[] reverseCopy(int[] array) {
        int helper[] = new int[array.length];
        int y = array.length;
        for (int i = 0; i < array.length; i++) {
            y--;
            helper[i] = array[y];
        }
        return helper;
    }
}
