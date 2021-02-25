package ru.job4j.condition;

public class Cinema {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        String rsl = allowByParent && hasMoney ? "I can go to the cinema." : "I can't.";
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}