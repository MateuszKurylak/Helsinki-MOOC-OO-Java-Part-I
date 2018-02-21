
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsCounter = 0;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random generator = new Random();
        for (int i = 0; i < this.width; i++) {
            double generated = generator.nextDouble();
            if (generated <= this.density) {
                System.out.print("*");
                this.starsCounter++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        this.starsCounter = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {
        return starsCounter;
    }
}
