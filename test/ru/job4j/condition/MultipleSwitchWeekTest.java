package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.MultipleSwitchWeek.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1232() {
        int expected = 1;
        int out = MultipleSwitchWeek.numberOfDay("Понедельник");
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDay1233() {
        int expected = 5;
        int out = MultipleSwitchWeek.numberOfDay("Friday");
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDay1239() {
        int expected = 7;
        int out = MultipleSwitchWeek.numberOfDay("Воскреснье");
        Assert.assertEquals(expected, out);
    }
}