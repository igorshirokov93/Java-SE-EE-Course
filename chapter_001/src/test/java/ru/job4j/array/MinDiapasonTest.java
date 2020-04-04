package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{10, 5, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }

    @Test
    public void whenFirst7Min() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{-1, -3, 5, 11, 0, -5, 8},
                        0, 4
                ),
                is(-3)
        );
    }

    @Test
    public void whenLast6Min() {
        assertThat(
                MinDiapason.findMin(
                        new int[]{5, 34, 1, 16, -9, -4},
                        2, 5
                ),
                is(-9)
        );
    }
}