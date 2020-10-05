package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        int[] result = Merge.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[]{1, 3},
                new int[]{2, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[]{1, 2},
                new int[]{3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = Merge.merge(
                new int[]{1, 2, 3},
                new int[]{3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[]{1, 2},
                new int[]{3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[]{},
                new int[]{1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenNegativeNumbers() {
        int[] expect = {-5, -3, -2, -1, 0, 2, 3, 4, 9};
        int[] result = Merge.merge(
                new int[]{-5, -2, -1, 0},
                new int[]{-3, 2, 3, 4, 9}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAllNegativeNumbers() {
        int[] expect = {-115, -67, -50, -43, -37, -18, -9, -1};
        int[] result = Merge.merge(
                new int[]{-115, -50, -43, -18},
                new int[]{-67, -37, -9, -1}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenMoreNumbers() {
        int[] expect = {-11, -4, 2, 5, 14, 30, 37, 48, 56, 83, 100};
        int[] result = Merge.merge(
                new int[]{-11, 5, 14, 30, 56, 83},
                new int[]{-4, 2, 37, 48, 100}
        );
        assertThat(result, is(expect));
    }
}