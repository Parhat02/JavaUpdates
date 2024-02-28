package com.cydeo.task;

import lombok.*;

@Data
@AllArgsConstructor
public class Dish {

    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;
}
