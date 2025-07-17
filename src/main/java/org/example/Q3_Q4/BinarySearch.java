package org.example.Q3_Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BinarySearch {

    @Autowired
    Sorting sorting;

    BinarySearch(Sorting sorting) {
        this.sorting = sorting;
    }

    public int search(int[] arr, int num) {
        int[] sort = sorting.sort(arr);
        return Arrays.stream(sort).boxed().toList().indexOf(num);
    }
}
