package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[]{31, 14, 25};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{14, 25, 31};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[]{29, 43, 12, 17, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{5, 12, 17, 29, 43};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort6() {
        int[] input = new int[]{46, 11, 27, 8, 19, 35};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{8, 11, 19, 27, 35, 46};
        assertThat(result, is(expect));
    }
}