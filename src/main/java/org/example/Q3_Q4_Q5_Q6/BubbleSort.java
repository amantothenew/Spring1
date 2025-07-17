package org.example.Q3_Q4_Q5_Q6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Primary
public class BubbleSort implements Sorting {
    @Override
    public int[] sort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }
}
