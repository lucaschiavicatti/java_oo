package util;

public class CurrencyConverter {

    public static double payForDolar(double priceDolar, double dolar) {
        return priceDolar * dolar + (priceDolar * 6/100);
    }
}
