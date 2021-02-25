package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        amount = (int) (((percent / 100) * amount) + amount);
        while (amount > salary) {
            amount = amount - salary;
            amount = (int) ((amount * (percent / 100)) + amount);
            year += 1;
        }
        return year;
    }
}