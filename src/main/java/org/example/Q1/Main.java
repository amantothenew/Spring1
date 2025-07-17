package org.example.Q1;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(new BubbleSort());
        int search = binarySearch.search(new int[]{12, 34, 12, 3, 42, 54, 6, 76, 5, 6}, 76);
        System.out.println(search);
    }
}
