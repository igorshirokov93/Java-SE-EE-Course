package ru.job4j.loop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 16.03.2020
 */

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for (i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(5, 17));
        System.out.println(sum(-4, 6));
        System.out.println(sum(-1, 2));
    }
}