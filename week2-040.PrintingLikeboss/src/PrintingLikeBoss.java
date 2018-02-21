
public class PrintingLikeBoss {

    public static void printStars(int amount) {
        for (int counter = 1; counter <= amount; counter++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        for (int counter = 1; counter <= amount; counter++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        int counterUp = 1;
        while (counter <= size) {
            printWhitespaces(size - 1);
            printStars(counterUp);
            counterUp++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        int counter = 1;
        int counterUp = 1;
        int stand = height;
        while (counter <= height) {
            printWhitespaces(height - 1);
            printStars(counterUp);
            counterUp = counterUp + 2;
            height--;
        }
        while (counter <= 2) {
            counterUp = stand - 2;
            printWhitespaces(counterUp);
            printStars(3);
            counter++;
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
