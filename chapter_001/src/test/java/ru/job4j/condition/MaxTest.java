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

    @Test
    public void whenMax7To8To9Then9() {
        int result = Max.max(7, 8, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax18To11To13Then18() {
        int result = Max.max(18, 11, 13);
        assertThat(result, is(18));
    }

    @Test
    public void whenMax5To5To5Then5() {
        int result = Max.max(5, 5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To4To16To20Then20() {
        int result = Max.max(5, 4, 16, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenMax67To43To85To26Then85() {
        int result = Max.max(67, 43, 85, 26);
        assertThat(result, is(85));
    }

    @Test
    public void whenMax534To742To135To267Then742() {
        int result = Max.max(534, 742, 135, 267);
        assertThat(result, is(742));
    }
}