package ru.job4j.array;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 05.08.2018.
 */
public class FindLoop {
    /**
     * Поиск элемента в массиве перебором.
     *
     * @param data Массив для поиска.
     * @param el   Разыскиваемое значение.
     * @return Найденное значение.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; 
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}