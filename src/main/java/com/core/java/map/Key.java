package com.core.java.map;

import java.util.Objects;

public class Key {
    String key;

    public Key(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        return key.equals((String) o);
    }

    @Override
    public int hashCode() {
        return (int) key.charAt(0);
    }
}
