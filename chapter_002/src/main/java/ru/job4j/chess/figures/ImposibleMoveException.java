package ru.job4j.chess.figures;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 17.10.2018
 */

public class ImposibleMoveException extends RuntimeException {
    public ImposibleMoveException(String msg) {
        super(msg);
    }

}