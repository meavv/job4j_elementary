package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int i = point + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        String temp = array[i];
                        array[i] = array[index];
                        array[index] = temp;
                        break;
                    }
                }

            }
        }
        return array;
    }
}