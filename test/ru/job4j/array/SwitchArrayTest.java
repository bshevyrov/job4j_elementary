package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int dest = input.length - 1;
        int source = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapBoarder() {
        int[] input = {4, 3, 2, 1};
        int[] result = SwitchArray.swapBoarder(input);
        int[] expected = {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }
}