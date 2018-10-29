package ru.job4j.comparator;

import java.util.Comparator;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 29.10.2018
 */

public class ListCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = 0;
        int compareLength = Integer.compare(left.length(), right.length());
        for (int index = 0; index < (compareLength > 0 ? right.length() : left.length()); index++) {
            result = Character.compare(left.charAt(index), right.charAt(index));
            if (result != 0) {
                break;
            }
        }
        if (result == 0 && compareLength != 0) {
            result = compareLength;
        }
        return result;
    }
}