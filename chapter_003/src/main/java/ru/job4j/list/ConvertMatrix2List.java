package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 25.10.2018
 */

public class ConvertMatrix2List {
    /**
     * public List<Integer> toList (int[][] array) {} - в метод
     * приходит двумерный массив целых чисел, необходимо пройтись
     * по всем элементам массива и добавить их в List<Integer>
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
} 