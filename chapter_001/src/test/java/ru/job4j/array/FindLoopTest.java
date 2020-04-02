package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $2$
 * @since 02.04.2020.
 */

public class FindLoopTest {
    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength6ThenMinus1() {
        int[] input = new int[]{5, 10, 3};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind2() {
        int[] input = new int[]{5, 3, 10, 2, 4};
        int value = 10;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind6() {
        int[] input = new int[]{8, 4, 9, 20, 43, 56, 67, 75};
        int value = 67;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4() {
        int[] input = new int[]{8, 4, 9, 20, 43, 56, 67, 75};
        int value = 43;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }
}