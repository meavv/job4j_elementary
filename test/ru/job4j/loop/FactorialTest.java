package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateFactorialFor6Then720() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int rsl = Factorial.calc(6);
        int expected = 720;
        assertThat(rsl, Matchers.is(expected));
    }
}