package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixMonoTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixMono.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontal2() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' '},
        };
        boolean result = MatrixMono.monoHorizontal(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontal3() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        };
        boolean result = MatrixMono.monoHorizontal(input, 3);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoHorizontal4() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixMono.monoHorizontal(input, 3);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixMono.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical2() {
        char[][] input = {
                {' ', ' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X', ' '},
        };
        boolean result = MatrixMono.monoVertical(input, 4);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical3() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
        };
        boolean result = MatrixMono.monoVertical(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical4() {
        char[][] input = {
                {' ', ' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixMono.monoVertical(input, 3);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixMono.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDiagonal2() {
        char[][] input = {
                {'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' '},
                {' ', ' ', ' ', 'X'},
        };
        char[] result = MatrixMono.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDiagonal3() {
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X'},
        };
        char[] result = MatrixMono.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X', 'X', 'X'};
        assertThat(result, is(expect));
    }
}