package ru.job4j.tictactoe;

import java.util.function.Predicate;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 07.10.2018.
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        for (int i = 0; i != this.table.length; i++) {
            if (this.fillBy(Figure3T::hasMarkX, i, 0, 0, 1)
                    || this.fillBy(Figure3T::hasMarkX, 0, i, 1, 0)) {
                result = true;
                break;
            }
        }
         return result || this.fillBy(Figure3T::hasMarkX, 0, 0, 1, 1)
                || this.fillBy(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1);
    }

    public boolean isWinnerO() {
        boolean result = false;
        for (int i = 0; i != this.table.length; i++) {
            if (this.fillBy(Figure3T::hasMarkO, i, 0, 0, 1)
                    || this.fillBy(Figure3T::hasMarkO, 0, i, 1, 0)) {
                result = true;
                break;
            }
        }
        return result || this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 1)
        || this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1);
    }

    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < this.table.length && !result; i++) {
            for (int j = 0; j < this.table[i].length; j++) {
                if (!this.table[i][j].hasMarkX() & !this.table[i][j].hasMarkO()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }
}