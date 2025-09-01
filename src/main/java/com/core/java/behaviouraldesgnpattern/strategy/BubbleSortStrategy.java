package com.core.java.behaviouraldesgnpattern.strategy;

public class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using buble sort");
    }
}
