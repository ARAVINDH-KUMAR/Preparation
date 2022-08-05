package com.learn.java;

import java.util.Scanner;

public class StringFequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str;
        str = sc.nextLine();
        char [] input = str.toCharArray();
        int [] feq = new int[str.length()];
        int i,j;
        for (i=0;i<str.length();i++){
            feq[i]=1;
            for (j=i+1;j<str.length();j++){
                if(input[i]==input[j]){
                    feq[i]++;
                    input[j]=0;
                }
            }

        }
        for(i=0;i<feq.length;i++){
            if(input[i]!=' '&& input[i]!=0){
                System.out.println(input[i]+"-"+feq[i]);
            }
        }

    }
}
