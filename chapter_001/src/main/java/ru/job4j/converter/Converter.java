package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int ruble) {
        return ruble / 70;
    }

    public static int rubleToDollar(int ruble) {
        return ruble / 60;
    }

    public static int euroToRuble(int euro) {
        return euro * 70;
    }

    public static int dollarToRuble(int dollar) {
        return dollar * 60;
    }
}
