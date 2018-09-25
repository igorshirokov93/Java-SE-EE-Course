package ru.job4j.pseudo;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 25.09.2018.
 */

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        String ln = System.lineSeparator();
        pic.append("++++");
        pic.append(ln);
        pic.append("+  +");
        pic.append(ln);
        pic.append("+  +");
        pic.append(ln);
        pic.append("++++");
        return pic.toString();
    }
}