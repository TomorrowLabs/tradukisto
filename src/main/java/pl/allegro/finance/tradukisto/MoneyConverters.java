package pl.allegro.finance.tradukisto;

import static com.google.common.base.Verify.verifyNotNull;
import static pl.allegro.finance.tradukisto.internal.Container.*;

import java.math.BigDecimal;

import pl.allegro.finance.tradukisto.internal.BigDecimalToStringConverter;

public enum MoneyConverters {

    BRAZILIAN_PORTUGUESE_BANKING_MONEY_VALUE(brazilianPortugueseContainer().getBankingMoneyConverter()),
    ENGLISH_BANKING_MONEY_VALUE(englishContainer().getBankingMoneyConverter()),
    FINNISH_BANKING_MONEY_VALUE(finnishContainer().getBankingMoneyConverter()),
    GERMAN_BANKING_MONEY_VALUE(germanContainer().getBankingMoneyConverter()),
    RUSSIAN_BANKING_MONEY_VALUE(russianContainer().getBankingMoneyConverter()),
    POLISH_BANKING_MONEY_VALUE(polishContainer().getBankingMoneyConverter()),
    CZECH_BANKING_MONEY_VALUE(czechContainer().getBankingMoneyConverter()),
    SLOVAK_BANKING_MONEY_VALUE(slovakContainer().getBankingMoneyConverter()),
    LATVIAN_BANKING_MONEY_VALUE(latvianContainer().getBankingMoneyConverter()),
    KAZAKH_BANKING_MONEY_VALUE(kazakhContainer().getBankingMoneyConverter()),
    UKRAINIAN_BANKING_MONEY_VALUE(ukrainianContainer().getBankingMoneyConverter());

    private final BigDecimalToStringConverter converter;

    MoneyConverters(BigDecimalToStringConverter converter) {
        this.converter = converter;
    }

    public String asWords(BigDecimal value) {
        verifyNotNull(value);

        return converter.asWords(value);
    }
}
