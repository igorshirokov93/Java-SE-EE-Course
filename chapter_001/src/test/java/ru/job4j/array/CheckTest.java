package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 06.08.2018.
 */

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenEvenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean result = check.mono(new boolean[]{true, true, true, true});
        assertThat(result, is(true));
    }

    @Test
    public void whenEvenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean result = check.mono(new boolean[]{true, false, true, false});
        assertThat(result, is(false));
    }
}