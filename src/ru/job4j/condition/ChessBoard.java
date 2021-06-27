package ru.job4j.condition;

public class ChessBoard {
    public static boolean isValid(int x1, int y1, int x2, int y2) {
        return ((x1 >= 0 && x1 < 8)
                && (x2 >= 0 && x2 < 8)
                && (y1 >= 0 && y1 < 8)
                && (y2 >= 0 && y2 < 8));
    }

    public static boolean isDiagonalMove(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1, y1, x2, y2) && isDiagonalMove(x1, y1, x2, y2)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

}
