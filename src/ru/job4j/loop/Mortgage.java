package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double amount1 = ((percent/100) * amount) + amount;
        while (amount1 > salary) {
            amount1 = amount1 - salary;
            amount1 = (amount1*(percent/100)) + amount1;
            year += 1;
        }
        return year;
    }
}