package ru.job4j.loop;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 19.03.2020
 */

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}