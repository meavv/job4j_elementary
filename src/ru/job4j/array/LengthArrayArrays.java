package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int [][] numbers = {

                {1}, {5, 6}, {7, 8, 9}, {10, 11, 12, 13}
        };
        for (int[] number : numbers) {
            System.out.println("Размер вложенного массива равен: " + number.length);
        }
    }
}