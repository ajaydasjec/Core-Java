package com.core.java.java8;

import java.util.function.Consumer;

public class MyClass implements Interface1,Interface2{
    @Override
    public void method1(Consumer<? super String> consumer) {

    }

    @Override
    public void log(String str) {
        System.out.println("My Class Logging: "+str);
        Interface1.print(str);
    }

    @Override
    public void method2() {

    }

    /*MyClass would not compile without its own implementation of log(String str)*/
}
