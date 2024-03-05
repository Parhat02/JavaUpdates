package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 375.56;
        double amount2 = 375.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("375.56");
        BigDecimal b2 = new BigDecimal("375.26");
        System.out.println(b1.subtract(b2));

        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;
        System.out.println(b1.subtract(b3));
        System.out.println(b1.add(b4));
        System.out.println(b4.subtract(b5));
        System.out.println(b3.add(b5));
        System.out.println(b2.add(BigDecimal.TEN));

        System.out.println(b4.multiply(new BigDecimal("15.00")));
        System.out.println(b4.multiply(BigDecimal.valueOf(15.56)));

        //Scaling
        BigDecimal number1 = new BigDecimal("23.121112");
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));
        System.out.println(number1.setScale(2, RoundingMode.CEILING));
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));


        //Do not use equals(). Use compareTo()
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));  //returns 0
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));  //returns 1
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));  //returns -1
        

    }

}

class Employee{
    private String name;

    //private double salary;
    private BigDecimal salary;

}
