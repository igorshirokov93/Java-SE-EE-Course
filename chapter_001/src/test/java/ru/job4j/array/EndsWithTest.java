package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenEndWithPrefixThenTrueElse() {
        char[] word = {'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 's', 't'};
        char[] post = {'m', 'i', 's', 't'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalseElse() {
        char[] word = {'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 's', 't'};
        char[] post = {'n', 'i', 's', 't'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}