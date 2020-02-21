package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax19To5Then19() {
        int result = Max.max(19, 5);
        assertThat(result, is(19));
    }

    @Test
    public void whenMax67To34Then67() {
        int result = Max.max(67, 34);
        assertThat(result, is(67));
    }

    @Test
    public void whenMax7To7Then7() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }
}