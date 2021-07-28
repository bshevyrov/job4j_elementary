package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] data, int start, int finish) {
        int min = data[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }
        return min;
    }
}
