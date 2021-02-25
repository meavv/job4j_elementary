package ru.job4j.condition;

import java.util.Arrays;

public class EvenCheck {
    public static boolean check(int num) {
        return num % 2 == 0;

    }

    public static void main(String[] args) {
        int num = 2;

        System.out.println(EvenCheck.check(num));
    }

}

