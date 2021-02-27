package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int x = array.length-1;
        for (int i = 0; i < x; i++) {
            int temp = array[i];
            array[i] = array[x];
            array[x] = temp;
            x = x - 1;

        }
        return array;
    }
}