package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rsl = count / n;
        return count + rsl;
    }
    
    public static void main(String[] args) {
        System.out.println(BonusCupCoffee.countCup(7, 6));
        System.out.println(BonusCupCoffee.countCup(213, 6));
    }
}