package ru.job4j.converter;

/**
 * Конвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param ruble рубли.
     * @return Евро.
     */
    public int rubleToEuro(int ruble) {
        return ruble / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param ruble рубли.
     * @return Доллары
     */
    public int rubleToDollar(int ruble) {
        return ruble / 60;
    }
	
	/**
     * Конвертируем евро в рубли.
     * @param euro евро.
     * @return Рубли.
     */
    public int euroToRuble(int euro) {
        return euro * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param dollar доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int dollar) {
        return dollar * 60;
    }
}
