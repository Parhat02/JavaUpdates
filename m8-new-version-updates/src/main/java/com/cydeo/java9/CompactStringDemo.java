package com.cydeo.java9;

import java.time.LocalDate;

public class CompactStringDemo {

    public static void main(String[] args) {

        String abc = "cydeo";

        TestPrivateInterface testPrivateInterface = new TestPrivateInterface();
        LocalDate date1 = LocalDate.of(2003,1,1);
        System.out.println(testPrivateInterface.nextDay(date1));
    }
}
