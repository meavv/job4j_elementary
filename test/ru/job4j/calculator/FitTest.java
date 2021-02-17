package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;



public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double rsl = Fit.manWeight(in);
        Assert.assertEquals(expected, rsl, 0.01);

    }

    @Test
    public void whenWoman160Then57() {
        short in = 160;
        double expected = 57.49;
        double rsl = Fit.womanWeight(in);
        Assert.assertEquals(expected, rsl, 0.01);

    }
}