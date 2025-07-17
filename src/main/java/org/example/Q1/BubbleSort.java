package org.example.Q1;

import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }
}
