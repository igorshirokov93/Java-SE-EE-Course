package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.*;

import static java.lang.Math.abs;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 17.10.2018
 */

public class KnightBlack implements Figure {
    /**
     * Поле номер позиции фигуры
     */
    private final Cell position;

    /**
     * Конструктор
     *
     * @param position типа Cell
     */
    public KnightBlack(final Cell position) {
        this.position = position;
    }

    /**
     * Метод возвращает позицию фигуры
     *
     * @return Cell
     */
    @Override
    public Cell position() {
        return this.position;
    }

    /**
     * Метод возвращает массив позиций передвижения фигуры
     *
     * @param source типа Cell
     * @param dest   типа Cell
     * @return типа Cell[]
     */
    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException {
        Cell[] steps = {dest};
        int absDeltaX = abs(dest.x - source.x);
        int absDeltaY = abs(dest.y - source.y);
        if (!((absDeltaX == 2 & absDeltaY == 1) || (absDeltaY == 2 & absDeltaX == 1))) {
            throw new ImposibleMoveException("Конь не может так ходить!");
        }
        return steps;
    }

    /**
     * Метод устанавливает новую позицию фигуры
     *
     * @param dest типа Cell
     * @return типа Cell
     */
    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}