package org.example.Q3_Q4;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MergeSort implements Sorting {

    @Override
    public int[] sort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }

}
