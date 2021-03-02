package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int sdacha = money - price;
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while ((sdacha - coins[i]) >= 0) {
                sdacha = sdacha - coins[i];
                rsl[i] = coins[i];
                size = i + 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}