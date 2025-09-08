package com.core.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExample {
    static class Sale{
        String item;
        double amount;

        public Sale(String item, double amount) {
            this.item = item;
            this.amount = amount;
        }
        double getAmount(){
            return this.amount;
        }
    }
   static class Expense {
        String category;
        private double expense;
        Expense(String _category, double _expense) {
            this.category = _category;
            this.expense = _expense;
        }
        double getExpense() {
            return expense;
        }
        String getCategory() {
            return category;
        }
    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> sum  = stream.reduce(Integer::sum);
        sum.ifPresent(System.out::println);
        stream = Stream.of(1, 2, 3, 4, 5);
        int product = stream.reduce(1,(a,b)->a*b);
        System.out.println(product);
        Stream<String> stream1 = Stream.of("A", "B", "C", "D", "E");

        String result = stream1.reduce("",
                (s1,s2)-> s1+s2,
                (s1,s2)->s1+s2);
        System.out.println(result);

        Stream<Sale> sales = Stream.of(
                new Sale("Item1", 100.0),
                new Sale("Item2", 200.0),
                new Sale("Item3", 300.0)
        );
        double totalSales = sales.reduce(0.0, (sum1,sale)-> sum1 + sale.getAmount(), Double::sum);
        System.out.println(totalSales);

        List< String > numbers = Arrays.asList("one", "two", "three", "four", "five");
        String result1 = numbers.stream()
                .reduce("=>", (first, second) -> first + "$" + second,
        (first, second) -> first + "%" + second);
        System.out.println(result1);

        List < Expense > expenseList = Arrays.asList(new Expense("fuel", 200),
                new Expense("grocery", 1000),
                new Expense("rent", 500),
                new Expense("outdoor", 560.5));
        expenseList.stream().reduce(0.0,(resut3, current)->resut3 + current.getExpense(),Double::sum);
    }
}
