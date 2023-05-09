package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();

        //java: name has private access in com.driver.RWOnly
//        rwOnly.name = "SAHIL";
//        System.out.println(rwOnly.name);

        rwOnly.setName("SAHIL");
        System.out.println(rwOnly.getName());
    }
}