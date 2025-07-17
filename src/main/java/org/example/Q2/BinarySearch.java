package org.example.Q2;

import java.util.Arrays;

public class BinarySearch {

    private Sorting sorting;

    BinarySearch(Sorting sorting) {
        this.sorting = sorting;
    }

    public int search(int[] arr, int num) {
        int[] sort = sorting.sort(arr);
        return Arrays.stream(sort).boxed().toList().indexOf(num);
    }
}
