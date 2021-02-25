package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To4Then4() {
        int result = Max.max(1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To1Then4() {
        int result = Max.max(4, 1);
        assertThat(result, is(4));
    }
}