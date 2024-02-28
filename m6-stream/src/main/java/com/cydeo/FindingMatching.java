package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        //All MATCH
        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);
        isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<700);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        isHealthy = DishData.getAll().stream().anyMatch(dish -> dish.getCalories()>700);
        System.out.println(isHealthy);
        isHealthy = DishData.getAll().stream().anyMatch(dish -> dish.getCalories()>1000);
        System.out.println(isHealthy);
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NON MATCH");
        isHealthy = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy);

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);
        System.out.println(dish.get());

        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0, 100).parallel().findAny()); // parallel streaming case
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.stream().parallel().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();
        System.out.println(findFirst);
        System.out.println(findAny);

        Optional<String> first = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> any = list2.stream().filter(s -> s.startsWith("J")).findAny();
        System.out.println(first);
        System.out.println(any);

        //MIN AND MAx
        System.out.println("MIN");
        Optional<Dish> dishMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMin);

        System.out.println("MAX");
        Optional<Dish> dishMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMax);

    }
}
