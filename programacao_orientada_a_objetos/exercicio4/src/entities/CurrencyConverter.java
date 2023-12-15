
package entities;

public class CurrencyConverter {
    public static final double IOF = 6.0;

    public static double conversion(double price, double quantity) {
        double converted = price * quantity;
        return converted + (IOF / 100 * converted);
    }

}
