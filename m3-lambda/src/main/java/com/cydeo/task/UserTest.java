package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom","Evan",25));
        users.add(new User("Emma","Pollard",55));

        Predicate<User> userInfo = user -> user.getFirstName().startsWith("E");
        printName(users, userInfo);

        printName(users, user -> user.getLastName().startsWith("E"));

        //Print all element
        printName(users, user -> true);
    }

    //Write method which can accept different actions

    public static void printName(List<User> users, Predicate<User> p){
        for (User user : users) {
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }

}
