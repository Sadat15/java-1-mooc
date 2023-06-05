import java.util.Arrays;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        String value = String.valueOf(euros) + "." + String.valueOf(cents);
        Double doubleValue = Double.valueOf(value);

        String comparedValue = String.valueOf(compared.euros) + "." + String.valueOf(compared.cents);
        Double comparedDoubleValue = Double.valueOf(comparedValue);

        if (doubleValue < comparedDoubleValue) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        String value = String.valueOf(this.euros()) + "." + String.valueOf(this.cents());
        Double doubleValue = Double.valueOf(value);

        String decreaserValue = String.valueOf(decreaser.euros()) + "." + String.valueOf(decreaser.cents());
        Double decreaserDoubleValue = Double.valueOf(decreaserValue);

        Double newDoubleValue = doubleValue - decreaserDoubleValue;

        if (newDoubleValue < 0) {
            return new Money(0, 0);
        }

        String stringNewDoubleValue = String.format("%.2f", newDoubleValue);

        int euros = Integer.parseInt(stringNewDoubleValue.split("\\.")[0]);
        int cents = Integer.parseInt(stringNewDoubleValue.split("\\.")[1]);

        Money newMoney = new Money(euros, cents);

        return newMoney;
    }

}
