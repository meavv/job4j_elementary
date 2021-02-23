package ru.job4j.condition;

public class AttackRook {


        public static boolean check(String left, String right) {
            char left1 = left.charAt(0);
            char left2 = left.charAt(1);
            char right1 = right.charAt(0);
            char right2 = right.charAt(1);
            if (left1 == right1) {return true;}
            if (left2 == right2) {return true;}
            else return false;

        }
}