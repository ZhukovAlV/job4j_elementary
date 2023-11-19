package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;

        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)
                && x1 != x2 && y1 != y2) {

            var xAbs = Math.abs(x2 - x1);
            var yAbs = Math.abs(y2 - y1);

            if (xAbs == yAbs) {
                return xAbs;
            }
        }

        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}