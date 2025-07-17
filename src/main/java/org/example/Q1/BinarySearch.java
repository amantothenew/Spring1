package org.example.Q1;

import java.util.Arrays;

public class BinarySearch {

    private BubbleSort bubbleSort;

    BinarySearch(BubbleSort bubbleSort) {
        this.bubbleSort = bubbleSort;
    }

    public int search(int[] arr, int num) {
        int[] sort = bubbleSort.sort(arr);
        return Arrays.stream(sort).boxed().toList().indexOf(num);
    }
}
