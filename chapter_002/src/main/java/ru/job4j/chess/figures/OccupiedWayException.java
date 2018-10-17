package ru.job4j.chess.figures;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 17.10.2018
 */

public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException(String msg) {
        System.out.println(msg);
    }
}