package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 25.09.2018.
 */

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        String ln = System.lineSeparator();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("+")
                                .append(ln)
                                .append("++")
                                .append(ln)
                                .append("+ +")
                                .append(ln)
                                .append("++++")
                                .toString()
                )
        );
    }
}