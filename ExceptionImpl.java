package com.learn.java;

import java.util.Scanner;

public class ExceptionImpl {
    static void agecheck (int age) throws ExceptionExample{
        if (age<18)
           throw new ExceptionExample("Age is not valid to vote");
        else
            System.out.println("Added to voters list");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        try {
            agecheck(age);
        }
        catch (ExceptionExample e){
            System.out.println("Exception caught" + e);
        }

        System.out.println("Code After Exception block");
    }
}
