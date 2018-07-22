package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param R рубли.
     * @return Евро.
     */
    public int rubleToEuro(int R) {
        return R/70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param R рубли.
     * @return Доллары
     */
    public int rubleToDollar(int R) {
        return R/60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param E евро.
     * @return Рубли.
     */
    public int euroToRuble(int E) {
        return E*70;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param S доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int S) {
        return S*60;
    }
}