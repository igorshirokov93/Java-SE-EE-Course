package ru.job4j.array;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 27.03.2020.
 */

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        array[3] = array[4];
        array[4] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}