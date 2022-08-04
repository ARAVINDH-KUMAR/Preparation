package com.learn.java;

public class ExceptionExample extends Exception {
    public ExceptionExample (String Str){
        super(Str);
        System.out.println("Exception Triggered");
    }
}
