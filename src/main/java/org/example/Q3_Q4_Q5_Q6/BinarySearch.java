package org.example.Q3_Q4_Q5_Q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {


    Sorting sorting;

    @Autowired
    public BinarySearch(Sorting sorting) {
        this.sorting = sorting;
    }

    public int search(int[] arr, int num) {
        int[] sort = sorting.sort(arr);
        return Arrays.stream(sort).boxed().toList().indexOf(num);
    }
}
