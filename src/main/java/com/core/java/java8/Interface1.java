package com.core.java.java8;

import java.util.function.Consumer;

@FunctionalInterface
public interface Interface1 {
    void method1(Consumer<? super String> consumer);
    default void log(String str){
        System.out.println("I1 logging :"+str);
    }
    static void print(String str){
        System.out.println("Printing : "+str);
    }
    //Default method cannot override a method from java.lang.Object
//    default String toString(){
//        return "i1";
//    }
}
