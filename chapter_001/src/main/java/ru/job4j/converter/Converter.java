package ru.job4j.converter;

public class Converter {
    public int rubleToEuro(int ruble) {
        return ruble / 70;
    }

    public int rubleToDollar(int ruble) {
        return ruble / 60;
    }

    public int euroToRuble(int euro) {
        return euro * 70;
    }

    public int dollarToRuble(int dollar) {
        return dollar * 60;
    }
}
