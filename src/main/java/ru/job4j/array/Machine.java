package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int cashback = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (cashback - coins[i] >= 0) {
                cashback -= coins[i];
                result[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}