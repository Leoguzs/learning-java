package com.leonardo.OOP;

public class Pizza {
    String bread;
    String size;
    String cheese;
    //constructor 1
    Pizza(String bread, String size){
        this.bread = bread;
        this.size = size;
    }
    //constructor 2
    Pizza(String bread, String size, String cheese){
        this.bread = bread;
        this.size = size;
        this.cheese = cheese;
    }
}
