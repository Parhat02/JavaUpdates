package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Calculate sum = (x, y) -> System.out.println(x+y);

        Calculate s1 = (x, y) -> System.out.println(x*y);

        Calculate sum1 = (x, y) -> Calculator.findSum(x,y);

        //Reference to a Static method
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(10, 20);

        //Reference to an instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiple;

        Calculate s4 = new Calculator() :: findMultiple;;

        BiFunction<String, Integer, String> function = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> function1 = String :: substring;

        Function<Integer, Double> b = new MyClass() :: method;
        BiFunction<MyClass, Integer, Double> b1 = MyClass :: method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display1 = System.out::println;

        display.accept(88);
        display1.accept(79);



    }
}
