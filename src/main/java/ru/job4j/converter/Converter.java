package ru.job4j.converter;

public class Converter {

    private static final float EURO_RATE = 70;
    private static final float DOLLAR_RATE = 60;

    public static float rubleToEuro(float value) {
        float result = value / EURO_RATE;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / DOLLAR_RATE;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        float input = 140;
        float expected = 2;
        float output = rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        input = 180;
        expected = 3;
        output = rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3 dollar. Test result : " + passed);
    }
}
