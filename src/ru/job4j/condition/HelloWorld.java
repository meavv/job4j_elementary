package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        if (number % 3 == 0) {
            if (number % 5==0) {return  ("Hello, World!!!");}
            else return ("Hello");
        }
        if (number % 5 == 0) {return  ("World");}
        else return "Operation not support";
    }
}