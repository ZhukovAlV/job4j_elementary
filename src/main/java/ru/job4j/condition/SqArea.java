package ru.job4j.condition;

public class SqArea {

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }

    public static double square(double p, double k) {
        double h = height(p, k);
        double l = length(p, h);
        return l * h;
    }

    public static double height(double p, double k) {
        return p / (2 * (k + 1));
    }

    public static double length(double h, double k) {
        return h * k;
    }

}
