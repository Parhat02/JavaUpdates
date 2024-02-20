package com.cydeo;

public enum Operation {

    PLUS,MINUS,MULTIPLY,DIVIDE; //each constant is object(new) of Operation

    private Operation() {
        System.out.println("Constructor");
    }

}
