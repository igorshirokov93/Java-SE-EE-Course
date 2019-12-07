package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $1$
 * @since 06.12.2019
 */

public class SqArea {

    /**
     * Расчет площади прямоугольника.
     *
     * @param p периметр.
     * @param k коэффициент.
     * @return площадь.
     */

    public static double square(int p, int k) {

        /**
         * формула s = w * h преобразуется к виду:
         * s = h^2 * k
         * s = k * ((p / (2(k+1))) ^ 2)
         */
        return (k * (Math.pow(p / (2 * (k + 1)), 2)));
    }

    public static void main(String[] args) {
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}