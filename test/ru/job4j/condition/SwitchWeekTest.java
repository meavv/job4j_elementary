package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDay1() {
        String expected = "Понедельник";
        String out = SwitchWeek.nameOfDay(1);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay4() {
        String expected = "Четверг";
        String out = SwitchWeek.nameOfDay(4);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay7() {
        String expected = "Воскресенье";
        String out = SwitchWeek.nameOfDay(7);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay10() {
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(10);
        Assert.assertEquals(expected, out);
    }
}