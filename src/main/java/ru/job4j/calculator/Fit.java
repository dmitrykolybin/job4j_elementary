package ru.job4j.calculator;

public class Fit {

    public static double calculateManWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double calculateWomanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 184;
        double man = calculateManWeight(height);
        double woman = calculateWomanWeight(height);
        System.out.println(String.format("Man %d is %.2f", height, man));
        System.out.println(String.format("Woman %d is %.2f", height, woman));
    }
}
