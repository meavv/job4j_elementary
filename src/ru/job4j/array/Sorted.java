package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        int x = array.length - 1;
        for (int i = 0; i < x; i++) {
            if (array[i] < array[i + 1]) {

            } else { return false;

            }
        }
     return true;
    }
}
