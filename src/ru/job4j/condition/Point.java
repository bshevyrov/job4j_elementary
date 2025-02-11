package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0,0) to (2,0) " + result);
        double result1 = Point.distance(1, 2, 1, 2);
        System.out.println("result (1,1) to (2,2) " + result1);
        double result2 = Point.distance(1, 3, 5, 7);
        System.out.println("result (1,5) to (3,7) " + result2);
        double result3 = Point.distance(3, 3, 3, 3);
        System.out.println("result (3,3) to (3,3) " + result3);
    }
}
