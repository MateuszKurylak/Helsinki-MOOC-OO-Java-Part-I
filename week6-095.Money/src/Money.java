
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money plus = new Money(added.euros + this.euros, added.cents + this.cents);
        return plus;
    }

    public boolean less(Money compared) {
        Money less = new Money(compared.euros, compared.cents);
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int valueOne;
        int valueTwo;
        int helper = 0;
        valueTwo = this.cents - decremented.cents;
        if (valueTwo < 0) {
            valueTwo = 100 - valueTwo * (-1);
            helper += 1;
        }
        valueOne = this.euros - decremented.euros - helper;
        if (valueOne < 0) {
            valueOne = 0;
            valueTwo = 0;
        }
        Money minus = new Money(valueOne, valueTwo);
        return minus;
    }
}
