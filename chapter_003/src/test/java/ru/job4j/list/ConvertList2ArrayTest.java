package ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 25.10.2018
 */

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when10ElementsThen12() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                4
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when10ElementsThen10() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                2
        );
        int[][] expect = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when8ElementsThen12() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 0},
        };
        assertThat(result, is(expect));
    }

    /**
     * Тест проверяет корректность преобразования списка массивов в список
     */
    @Test
    public void whenListOfArrayThenList() {
        ConvertList2Array list = new ConvertList2Array();
        List<int[]> listArr = new ArrayList<>();
        listArr.add(new int[]{1, 2, 3});
        listArr.add(new int[]{4, 5});
        listArr.add(new int[]{6, 7, 8, 9});
        List<Integer> result = list.convert(listArr);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(expect));
    }
}