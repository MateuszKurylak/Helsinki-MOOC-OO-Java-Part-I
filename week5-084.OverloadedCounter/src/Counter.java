
public class Counter {

    private int counter;
    private boolean check;

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        if (this.check == true) {
            this.counter--;
            if (this.counter <= 0) {
                this.counter = 0;
            }
        } else {
            this.counter--;
        }
    }

    public int value() {
        return this.counter;
    }

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;

    }

    public Counter(int startingValue) {
        this.counter = startingValue;
    }

    public Counter(boolean check) {
        this.counter = 0;
        this.check = check;
    }

    public Counter() {
        this.counter = 0;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counter += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
        } else if (this.check == true) {
            this.counter -= decreaseAmount;
            if (this.counter <= 0) {
                this.counter = 0;
            }
        } else {
            this.counter -= decreaseAmount;
        }
    }
}
