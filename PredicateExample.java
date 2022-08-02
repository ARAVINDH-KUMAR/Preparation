package com.learn.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void filterDuplicates(){
        List<String> s1 = Arrays.asList("aravindh","kumar","aravindh","kumar");
        List<String> s2;
       // Predicate<String> p1 = (Predicate<String>) s1.stream().distinct().collect(Collectors.toList());
        s2 = s1.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique List" + s2);
    }
    public static void main(String[] args) {
        filterDuplicates();
    }
}
