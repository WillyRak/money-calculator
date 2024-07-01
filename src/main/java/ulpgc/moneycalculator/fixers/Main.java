package ulpgc.moneycalculator.fixers;


import ulpgc.moneycalculator.Currency;
import ulpgc.moneycalculator.CurrencyLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CurrencyLoader currencyLoader = new FixerCurrencyLoader();
        List<Currency> currencies = currencyLoader.load();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }
}
