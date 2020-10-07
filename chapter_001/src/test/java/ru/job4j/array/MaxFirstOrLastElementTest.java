package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxFirstOrLastElementTest {

    @Test
    public void getMaxValueFirstElement() {
        int[] in = {5, 4, 3, 2, 1};
        int expected = 5;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueLastElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 5;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueIs0LastElement() {
        int[] in = {-5, -4, -3, -2, -1, 0};
        int expected = 0;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueIsMinus1FirstElement() {
        int[] in = {-1, -2, -3, -4, -5, -6};
        int expected = -1;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueIsBothElements() {
        int[] in = {-1, 0, 2, 3, -4, 5, -1};
        int expected = -1;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }
}