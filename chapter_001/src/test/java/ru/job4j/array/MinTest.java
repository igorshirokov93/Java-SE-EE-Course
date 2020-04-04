package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[]{0, 5, 10}
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[]{10, 5, 3}
                ),
                is(3)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[]{10, 2, 5}
                ),
                is(2)
        );
    }

    @Test
    public void whenFirst6Min() {
        assertThat(
                Min.findMin(
                        new int[]{5, 10, 4, 7, 3, 8}
                ),
                is(3)
        );
    }

    @Test
    public void whenLast5Min() {
        assertThat(
                Min.findMin(
                        new int[]{120, 95, 32, 23, 8}
                ),
                is(8)
        );
    }

    @Test
    public void whenMiddle7Min() {
        assertThat(
                Min.findMin(
                        new int[]{100, 25, 50, 10, 30, 45, 60}
                ),
                is(10)
        );
    }
}