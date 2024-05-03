package ru.job4j.calculator;

public class Calculator {

    public static int plus(int first, int second) {
        return first + second;
    }

    public static int minus(int first, int second) {
        return first - second;
    }

    public static void main(String[] args) {
        System.out.println(plus(1, 2));
        System.out.println(plus(10, 11));
        System.out.println(minus(7, 3));
        System.out.println(minus(2, 6));
    }

}