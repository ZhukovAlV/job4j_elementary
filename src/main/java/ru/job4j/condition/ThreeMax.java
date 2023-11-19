package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }
}
