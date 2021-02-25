package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);

        double rsl = Math.sqrt(x + y);

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(7, 9, 10, 7);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }

}