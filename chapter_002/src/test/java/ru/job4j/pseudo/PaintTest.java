package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream; 
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 26.09.2018.
 */

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(out));
    }

    @After
    public void backOutput() {
        System.setOut(stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        String ln = System.lineSeparator();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append(ln)
                                .append("+  +")
                                .append(ln)
                                .append("+  +")
                                .append(ln)
                                .append("++++")
                                .append(ln)
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        String ln = System.lineSeparator();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("+")
                                .append(ln)
                                .append("++")
                                .append(ln)
                                .append("+ +")
                                .append(ln)
                                .append("++++")
                                .append(ln)
                                .toString()
                )
        );
    }
}