
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private Random random = new Random();
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        int helper;
        while (this.numbers.size() < 7) {
            helper = this.random.nextInt(39) + 1;
            if (!this.containsNumber(helper)) {
                this.numbers.add(helper);
            }
        }

    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
