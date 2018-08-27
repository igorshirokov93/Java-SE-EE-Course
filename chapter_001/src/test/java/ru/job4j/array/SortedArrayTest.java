package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 
 /**
 * @Test
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 27.08.2018.
 */
 
public class SortedArrayTest {
     
    @Test
    public void whenBothArrIsFilled() {
        SortedArray arrayThird = new SortedArray();
        int[] firstArray = {1, 3, 4, 8, 10};
        int[] secondArray = {2, 4, 5, 6, 7, 9};
        int[] result = arrayThird.third(firstArray, secondArray);
        int[] expect = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }
     
    @Test
    public void whenFirstArrIsEmptyThenSecondArr() {
        SortedArray arrayThird = new SortedArray();
        int[] firstArray = {};
        int[] secondArray = {2, 4, 5, 6, 7, 9};
        int[] result = arrayThird.third(firstArray, secondArray);
        int[] expect = {2, 4, 5, 6, 7, 9};
        assertThat(result, is(expect));
    }
     
    @Test
    public void whenSecondArrIsEmptyThenFirstArr() {
        SortedArray arrayThird = new SortedArray();
        int[] firstArray = {1, 3, 4, 8, 10};
        int[] secondArray = {};
        int[] result = arrayThird.third(firstArray, secondArray);
        int[] expect = {1, 3, 4, 8, 10};
        assertThat(result, is(expect));
    }
     
    @Test
    public void whenBothArrIsEmptyThenEmptyArr() {
        SortedArray arrayThird = new SortedArray();
        int[] firstArray = {};
        int[] secondArray = {};
        int[] result = arrayThird.third(firstArray, secondArray);
        int[] expect = {};
        assertThat(result, is(expect));
    }
} 