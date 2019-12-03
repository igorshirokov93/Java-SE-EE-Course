package ru.job4j.converter;

public class ConverterTwo {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");
        int ruble = euroToRuble(6);
        System.out.println("6 euro are " + ruble + " rubles.");
        int rub = dollarToRuble(5);
        System.out.println("5 dollars are " + rub + " rubles.");
    }
}