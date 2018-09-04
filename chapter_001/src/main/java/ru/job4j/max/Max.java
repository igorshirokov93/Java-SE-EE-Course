package ru.job4j.max;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    public int max(int first, int second) {
        int temp = first > second ? first : second;
        return temp;
    }
    public int max(int first, int second, int third) {
        int temp = this.max(this.max(first, second), third);
        return temp;
    }
}