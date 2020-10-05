package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Даны два отсортированных по возрастанию массива. Нужно без сортировки объединить их в третий массив.$
 * @since 05.10.2020.
 */

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if ((i > left.length - 1) || (left[i] > right[j])) {
                rsl[k] = right[j];
                j++;
            } else if ((j > right.length - 1) || (left[i] < right[j])) {
                rsl[k] = left[i];
                i++;
            } else {
                rsl[k] = right[j];
                j++;
            }
        }
        return rsl;
    }
}