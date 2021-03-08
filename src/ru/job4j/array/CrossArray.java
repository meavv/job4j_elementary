package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                } else {
                    System.out.print("");
                }
            }
        }
    }




    /**
    public static void main(String[] args) {
        int[] left = new int[]{1, 2};
        int[] right = new int[]{3, 4};
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.print(left[i]);
                } else {
                    System.out.print("");
                }
            }
        }
    } **/
}