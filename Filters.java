package com.learn.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,2,3,3,6,5,5,4,78,9);
        List<Integer> evenList;
        List<Integer> oddList;
        evenList= l1.stream().filter(e -> e%2==0).distinct().collect(Collectors.toList());
        oddList=l1.stream().filter(e -> e%2!=0).distinct().collect(Collectors.toList());
        System.out.println("Even Numbers from the list :" + evenList);
        System.out.println("Odd Number from the List :" + oddList);
    }
}
