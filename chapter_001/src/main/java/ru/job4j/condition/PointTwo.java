package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $3$
 * @since 28.05.2020
 */

public class PointTwo {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    /**
     * Для инициализации начального состояния создадим конструктор, который принимает два параметра.
     */
    public PointTwo(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод distance должен принимать переменную Point.
     */
    public double distance(PointTwo that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        PointTwo a = new PointTwo(4, 3);
        PointTwo b = new PointTwo(5, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}