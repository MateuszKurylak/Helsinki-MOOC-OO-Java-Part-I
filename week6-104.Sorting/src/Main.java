
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a < smallest) {
                smallest = a;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int indexOf = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a < smallest) {
                smallest = a;
                indexOf = i;
            }
        }
        return indexOf;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int indexOf = index;
        for (int i = 0; i < array.length - index; i++) {
            int a = array[index + i];
            if (a < smallest) {
                smallest = a;
                indexOf = i + index;
            }
        }
        return indexOf;
    }

    public static void swap(int[] array, int index1, int index2) {
        int indexOne;
        int indexTwo;
        indexOne = array[index1];
        indexTwo = array[index2];
        array[index1] = indexTwo;
        array[index2] = indexOne;
    }

    public String toString(int array[]) {
        for (int values : array) {
            System.out.println(values);
        }
        return null;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
        }
    }
}
