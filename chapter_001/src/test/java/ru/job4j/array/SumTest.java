package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void getSum() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 6;
        int result = Sum.getSum(in);
        assertThat(result, is(expected));
    }

    @Test
    public void getSum1() {
        int[] in = {-1, 0, 1, 2, 3, 4};
        int expected = 3;
        int result = Sum.getSum(in);
        assertThat(result, is(expected));
    }

    @Test
    public void getSum2() {
        int[] in = {-6, -5, -4, -3, -2, -1, 0, 1, 2};
        int expected = -4;
        int result = Sum.getSum(in);
        assertThat(result, is(expected));
    }
}