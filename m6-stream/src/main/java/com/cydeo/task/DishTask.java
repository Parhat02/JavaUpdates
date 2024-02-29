package com.cydeo.task;

import java.util.Comparator;
import java.util.Optional;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter( dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                //.map(name -> name.length())
                .map(String::length)
                .forEach(System.out::println);

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
               // .map(dish -> dish.getName())
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("========================= Task4 ====================");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);


        // count the number of dishes in a stream using map and reduce methods
        Long count = DishData.getAll().stream().map(Dish::getName).count();
        System.out.println(count);

        Integer total = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(0,(a,b)-> a+b);
        System.out.println(total);

    }
}
