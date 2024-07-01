package ulpgc.moneycalculator.mocks;

import ulpgc.moneycalculator.Currency;
import ulpgc.moneycalculator.Money;
import ulpgc.moneycalculator.MoneyDialog;

import java.util.List;

public class MockMoneyDialog implements MoneyDialog {
    private List<Currency> currencies;

    @Override
    public MoneyDialog define(List<Currency> currencies) {
        this.currencies = currencies;
        return this;
    }

    @Override
    public Money get() {
        return new Money(200, currencies.get(0));
    }
}
