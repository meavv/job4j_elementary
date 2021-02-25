package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
         int sum = 0;
         for (int x = 0; x <= 4; x++) {
            int rsl = hours[x] <= 8 ? (hours[x] * 10) : ((hours[x] - 8) * 15 + (8 * 10));
             sum = sum + rsl;
            }
        for (int x = 5; x <= 6; x++) {
            int rsl = hours[x] <= 8 ? (hours[x] * 10) * 2 : ((hours[x] - 8) * 15 + (8 * 10)) * 2;
            sum = sum + rsl;
        }

         return sum;

    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};

        System.out.println(WeeklySalary.calculate(hours));
    }
}