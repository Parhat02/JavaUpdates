package com.cydeo.review;

public class Car {

    private String make;
    private int topSpeed;
    private int year;

    public Car(String make, int topSpeed, int year) {
        this.make = make;
        this.topSpeed = topSpeed;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", topSpeed=" + topSpeed +
                ", year=" + year +
                '}';
    }
}
