package ru.job4j.calculator;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 11.06.2020.
 */

public class MathFunc {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = x * 10;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int total = result1 + result2;
        System.out.println(total);
    }
}