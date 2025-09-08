package com.core.java.java8QA;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
    static int getSecondLargest(int[] arr){
        int length = arr.length;
        int largest = -1;
        int secondLargest = -1;

        for(int i=0;i<length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0;i<length;i++){
            if(arr[i] > secondLargest && arr[i] != largest ){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
