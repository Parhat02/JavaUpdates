package com.cydeo.review;

@FunctionalInterface
public interface CarPredicate {

    boolean test(Car car);

//    boolean test2(Car car);

    default void test3() {
        // Some method body
    }

}
