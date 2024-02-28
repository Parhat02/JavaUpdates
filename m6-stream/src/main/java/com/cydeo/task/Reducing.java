package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = numbers.stream().reduce(0,(a,b)-> a+b);
        System.out.println(sum);
//        int s = 0;
//        for (int number:numbers){
//            s += number;
//        }
//        System.out.println(s);

        Optional<Integer> result = numbers.stream().reduce((a,b) -> a+b);
        System.out.println(result.get());

        System.out.println("Dish calories total: ");
        int result1 = DishData.getAll().stream().map(Dish::getCalories)
                //.reduce((a,b) -> a+b).get();
                .reduce(Integer::sum).get();
        System.out.println(result1);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum1.get());

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}
