package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        int[] in = {-1, 0, 5, 10};
        int start = 0;
        int finish = 3;
        int result = MinDiapason.findMin(in, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] in = {-1, 9, 2, 10};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(in, start, finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] in = {-1, 0, 5, -10};
        int start = 0;
        int finish = 3;
        int result = MinDiapason.findMin(in, start, finish);
        int expected = -10;
        Assert.assertEquals(expected, result);
    }
}