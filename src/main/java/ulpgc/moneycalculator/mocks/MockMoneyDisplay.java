package ulpgc.moneycalculator.mocks;

import ulpgc.moneycalculator.Money;
import ulpgc.moneycalculator.MoneyDisplay;

public class MockMoneyDisplay implements MoneyDisplay {
    @Override
    public void show(Money money) {
        System.out.println(money);
    }
}
