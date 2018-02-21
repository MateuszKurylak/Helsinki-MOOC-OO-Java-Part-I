
public class Multiplier {

    private int numberMultiplier;

    public Multiplier(int number) {
        this.numberMultiplier = number;
    }

    public int multiply(int otherNumber) {
        otherNumber = this.numberMultiplier * otherNumber;
        return otherNumber;
    }
}
