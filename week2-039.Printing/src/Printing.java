
public class Printing {

    public static void printStars(int amount) {
        for (int counter = 1; counter <= amount; counter++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void printSquare(int sideSize) {
        int size = 1;
        while (size <= sideSize) {
            printStars(sideSize);
            System.out.print("");
            size++;
        }
    }

    public static void printRectangle(int width, int height) {
        int counter = 1;
        while (counter <= height) {
            printStars(width);
            System.out.print("");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            System.out.print("");
            counter++;
        }
    }

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
}
