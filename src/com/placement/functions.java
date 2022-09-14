package com.placement;

import java.util.*;

public class functions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        System.out.println("Enter a number : \n");

        table(2);

    }

    static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

}