package ru.job4j.tictactoe;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 01.09.2018.
 */
public class Logic3T {
    private final Figure3T[][] table;
    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }
    public boolean isWinnerX() {
        boolean result = true;
        for (int index = 0; index < table.length; index++) {
            if (!table[index][index].hasMarkX()) {
                result = false;
                break;
            }
        }
        if (!result) {
            for (int index = 0; index < table.length; index++) {
                if (!table[index][table.length - 1 - index].hasMarkX()) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = false;
        if (this.table[0][0].hasMarkO() && this.table[1][1].hasMarkO() && this.table[2][2].hasMarkO()
                || this.table[2][0].hasMarkO() && this.table[1][1].hasMarkO() && this.table[0][2].hasMarkO()) {
            result = true;
        }
        if (!result) {
            for (int i = 0; i < this.table.length; i++) {
                if (this.table[i][0].hasMarkO() && this.table[i][1].hasMarkO() && this.table[i][2].hasMarkO()) {
                    result = true;
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 0; i < this.table.length; i++) {
                if (this.table[0][i].hasMarkO() && this.table[1][i].hasMarkO() && this.table[2][i].hasMarkO()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table[i].length; j++) {
                if (!this.table[i][j].hasMarkX() & !this.table[i][j].hasMarkO()) {
                    result = true;
                    break;
                }
            }
            break;
        }
        return result;
    }
}