package com.cydeo.review;

import java.util.Arrays;

public class EnumTest {

    public static void main(String[] args) {

        User employeeUser = new User("mikesmith", "Mike", "Smith", RoleEnum.EMPLOYEE);

        System.out.println(employeeUser.getRole());

        System.out.println(RoleEnum.ADMIN);
        System.out.println(Arrays.toString(RoleEnum.values()));

    }
}
