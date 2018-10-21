package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.figures.*;
import ru.job4j.chess.figures.ImposibleMoveException;
import ru.job4j.chess.figures.black.*;
import ru.job4j.chess.figures.white.KnightWhite;

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
    public void testBishop() {
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

    /**
     * Проверка движения ладьи
     */
    @Test
    public void whenRookBlackMove() throws ImposibleMoveException {
        RookBlack rookBlack = new RookBlack(Cell.A8);
        Cell[] steps = new Cell[]{Cell.A7, Cell.A6};
        assertThat(rookBlack.way(Cell.A8, Cell.A6), is(steps));
    }

    /**
     * Вызов исключения в случае неправильного движения ладьи
     */
    @Test(expected = ImposibleMoveException.class)
    public void whenRookBlackWrongMove() throws ImposibleMoveException {
        RookBlack rookBlack = new RookBlack(Cell.A8);
        Cell[] steps = new Cell[]{Cell.A7, Cell.A6, Cell.B6};
        assertThat(rookBlack.way(Cell.A8, Cell.B6), is(steps));
    } 
	
	/**
     *  Проверка движения короля
     */
    @Test
    public void whenKingBlackMove() throws ImposibleMoveException {
        KingBlack kingBlack = new KingBlack(Cell.E8);
        Cell[] steps = new Cell[] {Cell.F7};
        assertThat(kingBlack.way(Cell.E8, Cell.F7), is(steps));
    } 
	
	/**
     *  Проверка движения ферьзя
     */
    @Test
    public void whenQueenBlackMove() throws ImposibleMoveException {
        QeenBlack queenBlack = new QeenBlack(Cell.D8);
        Cell[] steps = new Cell[] {Cell.D7, Cell.D6, Cell.D5};
        assertThat(queenBlack.way(Cell.D8, Cell.D5), is(steps));
    } 
	
	/**
     *  Проверка движения коня
     */
    @Test
    public void whenKnightBlackMove() throws ImposibleMoveException {
        KnightBlack knightBlack = new KnightBlack(Cell.B8);
        Cell[] steps = new Cell[] {Cell.C6};
        assertThat(knightBlack.way(Cell.B8, Cell.C6), is(steps));
    }

    @Test
    public void whenKnightWhiteMove() throws ImposibleMoveException {
        KnightWhite knightWhite = new KnightWhite(Cell.G1);
        Cell[] steps = new Cell[] {Cell.H3};
        assertThat(knightWhite.way(Cell.G1, Cell.H3), is(steps));
    }

    /**
     *  Вызов исключения в случае неправильного движения коня
     */
    @Test (expected = ImposibleMoveException.class)
    public void whenKnightBlackWrongMove() throws ImposibleMoveException {
        KnightBlack knightBlack = new KnightBlack(Cell.B8);
        Cell[] steps = new Cell[] {Cell.C7, Cell.D6};
        assertThat(knightBlack.way(Cell.B8, Cell.D6), is(steps));
    }
}