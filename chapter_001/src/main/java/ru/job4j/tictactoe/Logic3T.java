package ru.job4j.tictactoe;
 
import java.util.function.Predicate; 

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
        for (int index = 0; index < table.length - 1; index++) {
            if (table[index][index] != table[index + 1][index + 1]) {
                result = false;
                break;
            }
            if (table[table.length - 1 - index][index] != table[table.length - 2 - index][index + 1]) {
                result = false;
                break;
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][0] != table[i][j]) {
                    result = false;
                    break;
                }
                if (table[0][j] != table[i][j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = true;
        for (int index = 0; index < table.length - 1; index++) {
            if (table[index][index] != table[index + 1][index + 1]) {
                result = false;
                break;
            }
            if (table[table.length - 1 - index][index] != table[table.length - 2 - index][index + 1]) {
                result = false;
                break;
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][0] != table[i][j]) {
                    result = false;
                    break;
                }
                if (table[0][j] != table[i][j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].hasMarkX() == table[i][j].hasMarkO()) {
                    return true;
                }
            }
        }
        return result;
    }
}