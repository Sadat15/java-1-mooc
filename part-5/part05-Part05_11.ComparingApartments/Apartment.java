
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < this.squares) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared) {
        int difference = (compared.pricePerSquare * compared.squares) - (this.pricePerSquare * this.squares);

        return Math.abs(difference);

    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((compared.pricePerSquare * compared.squares) < (this.pricePerSquare * this.squares)) {
            return true;
        }

        return false;
    }

}
