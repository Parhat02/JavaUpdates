package com.cydeo.review;

public class RoleStatic {
    public static final RoleStatic ADMIN = new RoleStatic("ADMIN");
    public static final RoleStatic MANAGER = new RoleStatic("MANAGER");
    public static final RoleStatic EMPLOYEE= new RoleStatic("EMPLOYEE");

    public String value;

    private RoleStatic(String value) {
        this.value = value;
    }
}
