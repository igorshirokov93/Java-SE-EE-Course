package ru.job4j.condition;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $1$
 * @since 17.02.2020
 */

public class Liken {
    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second;
        System.out.println(result);

        result = first < second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
    }
}