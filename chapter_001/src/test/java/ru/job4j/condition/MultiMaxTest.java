package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(101, 35, 20);
        assertThat(result, is(101));
    }

    @Test
    public void whenSecMax() {
        MultiMax check = new MultiMax();
        int result = check.max(16, 38, 9);
        assertThat(result, is(38));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(87, 14, 203);
        assertThat(result, is(203));
    }

    @Test
    public void whenAllMax() {
        MultiMax check = new MultiMax();
        int result = check.max(47, 47, 47);
        assertThat(result, is(47));
    }
}