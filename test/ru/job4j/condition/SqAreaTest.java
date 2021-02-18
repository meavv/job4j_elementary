package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void squarewhen62then2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);

        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void squarewhen78then2() {
        int p = 7;
        int k = 8;
        double expected = 1.20;
        double out = SqArea.square(p, k);

        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void squarewhen89then2() {
        int p = 8;
        int k = 9;
        double expected = 1.44;
        double out = SqArea.square(p, k);

        Assert.assertEquals(expected, out, 0.01);
    }
}