package com.cydeo.task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println("Print all emails");
        EmployeeData.readAll()
                //.map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        System.out.println("Print All Phone Numbers");
        EmployeeData.readAll()
                //.map(employee -> employee.getEmpPhoneNumbers())
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers with Double Colon");
        EmployeeData.readAll()
                //.flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}

/*
map() takes Stream<T> as an input and returns Stream<R>. It is mapper function produces single value for each input
value. It is called One-to-One mapping
flatMap() takes Stream<Stream<T>> as an input and returns Stream<R>. It is called One-to-Many mapping
 */

