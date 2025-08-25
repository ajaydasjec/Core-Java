package com.core.java.sort;

import java.util.Comparator;

public class PersonWeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (int)(o1.getWeight() - o2.getWeight());
    }
}
