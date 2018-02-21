
public class BoundedCounter {

    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperlimit) {
        this.upperLimit = upperlimit;
    }

    public void next() {
        if (this.value < this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int values) {
        if (values < 0 || values > this.upperLimit) {
        } else {
            this.value = values;
        }
    }
}
