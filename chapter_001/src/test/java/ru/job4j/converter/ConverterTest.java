package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat; 

public class ConverterTest { 

@Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(140);
    assertThat(result, is(2));
    }

    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(180);
        assertThat(result, is(3));
    }

    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(5);
        assertThat(result, is(350));
    }

    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(7);
        assertThat(result, is(420));
    }
}