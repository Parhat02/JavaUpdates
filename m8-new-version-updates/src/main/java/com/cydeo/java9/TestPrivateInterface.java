package com.cydeo.java9;

import java.time.LocalDate;

public class TestPrivateInterface implements PrivateMethodInterface{


    @Override
    public boolean isHoliday(LocalDate date) {
        return false;
    }

    @Override
    public boolean isBusinessDay(LocalDate date) {
        return PrivateMethodInterface.super.isBusinessDay(date);
    }

    @Override
    public LocalDate nextDay(LocalDate date) {
        return PrivateMethodInterface.super.nextDay(date);
    }
}
