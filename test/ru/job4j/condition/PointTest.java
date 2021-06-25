package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then141() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, x2, y1, y2);
        double expected = 1.41;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to37then282() {
        int x1 = 1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 7;
        double out = Point.distance(x1, x2, y1, y2);
        double expected = 2.82;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to33then0() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, x2, y1, y2);
        double expected = 0;
        Assert.assertEquals(expected, out, 0.01);
    }
}