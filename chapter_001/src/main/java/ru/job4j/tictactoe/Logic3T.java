package ru.job4j.tictactoe;
/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 06.09.2018.
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
            result = true;
            for (int index = 0; index < table.length; index++) {
                if (!table[index][table.length - 1 - index].hasMarkX()) {
                    result = false;
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 0; i < table.length; i++) {
                result = true;
                for (int j = 0; j < table.length; j++) {
                    if (!table[i][j].hasMarkX()) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 0; i < table.length; i++) {
                result = true;
                for (int j = 0; j < table.length; j++) {
                    if (!table[j][i].hasMarkX()) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                }
            }
        }
        return result;
    }

        public boolean isWinnerO() {
            boolean result = true;
            for (int index = 0; index < table.length; index++) {
                if (!table[index][index].hasMarkO()) {
                    result = false;
                    break;
                }
            }
            if (!result) {
                result = true;
                for (int index = 0; index < table.length; index++) {
                    if (!table[index][table.length - 1 - index].hasMarkO()) {
                        result = false;
                        break;
                    }
                }
            }
            if (!result) {
                for (int i = 0; i < table.length; i++) {
                    result = true;
                    for (int j = 0; j < table.length; j++) {
                        if (!table[i][j].hasMarkO()) {
                            result = false;
                            break;
                        }
                    }
                    if (result) {
                        break;
                    }
                }
            }
            if (!result) {
                for (int i = 0; i < table.length; i++) {
                    result = true;
                    for (int j = 0; j < table.length; j++) {
                        if (!table[j][i].hasMarkO()) {
                            result = false;
                            break;
                        }
                    }
                    if (result) {
                        break;
                    }
                }
            }
        return result;
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
}