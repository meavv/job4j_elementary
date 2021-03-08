package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        int x = s.length() - 4;
        StringBuilder ss = new StringBuilder(s);
        if (s.equals("")) {
            s = "empty";
        }
        if (s.length() < 4) {
            s = s;
        } else {
            for (int i = 0; i < x; i++) {
                ss.setCharAt(i, '#');
                s = ss.toString();
            }
        }
        return s;
    }
}