
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {
        int a = this.pricePerSquareMeter * this.squareMeters;
        int b = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        int priceDiff;
        if (a > b) {
            priceDiff = a - b;
        } else {
            priceDiff = b - a;
        }
        return priceDiff;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        if ((this.pricePerSquareMeter * this.squareMeters) > (otherApartment.pricePerSquareMeter * otherApartment.squareMeters)) {
            return true;
        }
        return false;
    }
}
