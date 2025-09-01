package com.core.java.behaviouraldesgnpattern.strategy;

public class MergeSortStrategy implements SortingStrategy{

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting Merge Sort");
    }

}
