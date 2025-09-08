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

        PaymentContext paymentContext = new PaymentContext(new CreditcardPayment());
        paymentContext.checkOut(5000);
        PaymentContext paymentContext1 = new PaymentContext(new PaypalPayment());
        paymentContext1.checkOut(6000);

    }
}
