package com.core.java.behaviouraldesgnpattern.strategy;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1,2};
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());

        sortingContext.performSort(arr);
        sortingContext = new SortingContext(new MergeSortStrategy());
        sortingContext.performSort(arr);
        sortingContext = new SortingContext(new QuickSortStrategy());
        sortingContext.performSort(arr);

    }
}
