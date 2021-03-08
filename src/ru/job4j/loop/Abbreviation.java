package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        char space = ' ';
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == space) {
                str.append(s.charAt(i + 1));

            }
        }
        return str.toString();
    }
}