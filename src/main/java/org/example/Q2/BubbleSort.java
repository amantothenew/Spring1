package org.example.Q2;

import java.util.Arrays;

public class BubbleSort implements Sorting{
    @Override
    public int[] sort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }
}
