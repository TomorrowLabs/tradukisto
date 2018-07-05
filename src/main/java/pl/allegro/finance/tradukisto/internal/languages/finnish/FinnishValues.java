package pl.allegro.finance.tradukisto.internal.languages.finnish;

import pl.allegro.finance.tradukisto.internal.BaseValues;
import pl.allegro.finance.tradukisto.internal.languages.GenderForms;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;
import pl.allegro.finance.tradukisto.internal.languages.RegularPluralForms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static pl.allegro.finance.tradukisto.internal.support.BaseNumbersBuilder.baseNumbersBuilder;

public class FinnishValues implements BaseValues {

    @Override
    public Map<Integer, GenderForms> baseNumbers() {
        return baseNumbersBuilder()
                .put(0, "nolla")
                .put(1, "yksi")
                .put(2, "kaksi")
                .put(3, "kolme")
                .put(4, "neljä")
                .put(5, "viisi")
                .put(6, "kuusi")
                .put(7, "seitsemän")
                .put(8, "kahdeksan")
                .put(9, "yhdeksän")
                .put(10, "kymmenen")
                .put(11, "yksitoista")
                .put(12, "kaksitoista")
                .put(13, "kolmetoista")
                .put(14, "neljätoista")
                .put(15, "viisitoista")
                .put(16, "kuusitoista")
                .put(17, "seitsemäntoista")
                .put(18, "kahdeksantoista")
                .put(19, "yhdeksäntoista")
                .put(20, "kaksikymmentä")
                .put(30, "kolmekymmentä")
                .put(40, "neljäkymmentä")
                .put(50, "viisikymmentä")
                .put(60, "kuusikymmentä")
                .put(70, "seitsemänkymmentä")
                .put(80, "kahdeksankymmentä")
                .put(90, "yhdeksänkymmentä")
                .put(100, "sata")
                .put(200, "kaksi sataa")
                .put(300, "kolme sataa")
                .put(400, "neljä sataa")
                .put(500, "viisi sataa")
                .put(600, "kuusi sataa")
                .put(700, "seitsemä sataa")
                .put(800, "kahdeksan sataa")
                .put(900, "yhdeksän sataa")
                .put(1000, "tuhat")
                .build();
    }

    @Override
    public List<PluralForms> pluralForms() {
        return Arrays.asList(
                new FinnishPluralForms(""),
                new RegularPluralForms("tuhat", "tuhatatta"),
                new RegularPluralForms("miljoona", "miljoonaa"),
                new RegularPluralForms("miljardi", "miljardia"));
    }

    @Override
    public String currency() {
        return "€";
    }

    @Override
    public char twoDigitsNumberSeparator() {
        return ' ';
    }
}
