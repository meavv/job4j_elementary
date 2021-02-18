package ru.job4j.converter;
import org.junit.Test;
import org.junit.Assert;


public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 210;
        int expected = 3;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 240;
        int expected = 4;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}