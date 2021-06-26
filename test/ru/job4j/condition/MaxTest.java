package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = 2;
        int expected = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = 5;
        int expected = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To9Then9() {
        int left = 7;
        int right = 9;
        int result = 9;
        int expected = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = 4;
        int expected = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }
}