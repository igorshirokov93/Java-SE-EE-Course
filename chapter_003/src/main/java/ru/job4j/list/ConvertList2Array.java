package ru.job4j.list;

import java.util.List;
import java.util.ListIterator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 25.10.2018
 */

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() % rows > 0 ? list.size() / rows + 1 : list.size() / rows;
        int[][] array = new int[rows][cells];
        ListIterator<Integer> iterator = list.listIterator();
        for (int[] row : array) {
            for (int index = 0; index < row.length; index++) {
                if (iterator.hasNext()) {
                    row[index] = iterator.next().intValue();
                }
            }
        }
        return array;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] array : list) {
            for (int value : array) {
                result.add(value);
            }
        }
        return result;
    }

} 