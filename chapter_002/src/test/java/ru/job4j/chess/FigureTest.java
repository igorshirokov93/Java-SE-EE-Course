package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.figures.*;
import ru.job4j.chess.figures.ImposibleMoveException;
import ru.job4j.chess.figures.black.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 17.10.2018
 */

public class FigureTest {

    /**
     * Проверка движения слона
     */
    @Test
    public void whenBishopBlackMove() throws ImposibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell[] steps = new Cell[]{Cell.D7, Cell.E6};
        assertThat(bishopBlack.way(Cell.C8, Cell.E6), is(steps));
    }

    @Test
    public void Test() {
        BishopBlack bishop = new BishopBlack(Cell.A1);
        Cell[] actual = bishop.way(bishop.position(), Cell.H8);
        Cell[] expected = {Cell.B2, Cell.C3, Cell.D4, Cell.E5, Cell.F6, Cell.G7, Cell.H8};
        assertThat(actual, is(expected));
    }

    /**
     * Проверка движения пешки
     */
    @Test
    public void whenPawnBlackMove() throws ImposibleMoveException {
        PawnBlack pawnBlack = new PawnBlack(Cell.C7);
        Cell[] steps = new Cell[]{Cell.C6, Cell.C5};
        assertThat(pawnBlack.way(Cell.C7, Cell.C5), is(steps));
    }
}