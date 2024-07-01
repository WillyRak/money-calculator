package ulpgc.moneycalculator.swing;

import ulpgc.moneycalculator.Money;
import ulpgc.moneycalculator.MoneyDisplay;

import javax.swing.*;

public class SwingMoneyDisplay extends JLabel implements MoneyDisplay {
    @Override
    public void show(Money money) {
        this.setText(money.toString());
    }
}