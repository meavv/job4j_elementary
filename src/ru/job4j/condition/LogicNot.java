package ru.job4j.condition;

import java.util.Arrays;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return !isEven(num) && !isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        return !isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(LogicNot.isEven(num));
    }

}
