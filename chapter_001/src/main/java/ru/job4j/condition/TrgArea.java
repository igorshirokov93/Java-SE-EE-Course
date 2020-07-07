package ru.job4j.condition;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $?$
 * @since 07.07.2020
 */

public class TrgArea {

    private PointTwo first;
    private PointTwo second;
    private PointTwo third;

    public TrgArea(PointTwo ap, PointTwo bp, PointTwo cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }


    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ab + bc > ac && ac + bc > ab);
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
}