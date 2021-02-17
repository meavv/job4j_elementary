package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        int in = 140;
        int expected  = 2;
        int out1 = Converter.rubleToEuro(in);
        int out2 = Converter.rubleToDollar(in);
        boolean passed1 = expected == out1;
        boolean passed2 = expected == out2;
        System.out.println("140 rubles are " + euro + " euro." + passed1);
        System.out.println("140 rubles are " + dollar + " dollar." + passed2);
    }

}