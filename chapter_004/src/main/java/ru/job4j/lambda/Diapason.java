package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Igor Shirokov (freelancerigor@yandex.ru)
 * @version $Id$
 * @since 29.11.2018
 */

public class Diapason {
    /**
     * Метод calcFunction(int start, int end, Function<Double, Double> func).
     * Заполнение листа результатами работы определенной пользователем функции в диапазоне.
     *
     * @param start начало диапазона.
     * @param end   конец диапазона.
     * @param func  готовый функциональный интерфейс.
     * @return список типа ArrayList<Double> с результатами вычислений.
     */
    public List<Double> calcFunction(int start, int end, Function<Double, Double> func) {
        List<Double> resList = new ArrayList<>();
        for (int index = start; index != end; index++) {
            resList.add(func.apply((double) index));
        }
        return resList;
    }
}