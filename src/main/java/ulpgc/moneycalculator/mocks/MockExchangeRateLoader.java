package ulpgc.moneycalculator.mocks;

import ulpgc.moneycalculator.Currency;
import ulpgc.moneycalculator.ExchangeRate;
import ulpgc.moneycalculator.ExchangeRateLoader;

import java.time.LocalDate;

public class MockExchangeRateLoader implements ExchangeRateLoader {
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return new ExchangeRate(from, to, LocalDate.now(), 1.218);
    }
}
