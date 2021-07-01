package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] in = {0, 5, 10};
        int result = Min.findMin(in);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] in = {5, 2, 10};
        int result = Min.findMin(in);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] in = {10, 5, 3};
        int result = Min.findMin(in);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}