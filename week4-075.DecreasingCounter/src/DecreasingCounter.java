
public class DecreasingCounter {

    private int value;  
    private int catcher;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.catcher = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = catcher;
    }
}
