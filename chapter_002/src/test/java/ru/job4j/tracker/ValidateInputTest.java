package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 02.10.2018.
 */

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[]{"invalid", "1"}));
        input.ask("Enter", new ArrayList<Integer>() {
            {
                add(1);
            }
        });
        assertThat(this.mem.toString(), is(String.format("Пожалуйста введите цифру%n")));
    }
} 