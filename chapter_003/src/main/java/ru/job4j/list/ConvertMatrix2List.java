package ru.job4j.list;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 30.12.2018
 */

public class ConvertMatrix2List {
    /**
     * public List<Integer> toList (int[][] array) {} - в метод
     * приходит двумерный массив целых чисел, необходимо пройтись
     * по всем элементам массива и добавить их в List<Integer>
     */
    public List<Integer> toList(int[][] array) {
        return Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
} 