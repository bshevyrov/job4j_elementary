package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public  void whenSortThreeItems() {
        int[] expected = {1, 2, 3};
        int[] in = {3, 2, 1};
        int[] result = SortSelected.sort(in);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public  void whenSortFiveItems() {
        int[] expected = {-1, 2, 234, 0, 4};
        int[] in = {-1, 0, 2, 4, 234};
        int[] result = SortSelected.sort(in);
        Assert.assertArrayEquals(expected, result);
    }
}