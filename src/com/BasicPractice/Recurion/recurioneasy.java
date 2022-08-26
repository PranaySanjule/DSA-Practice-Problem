package com.BasicPractice.Recurion;

public class recurioneasy {
    public static void main(String[] args) {
        fun(5);
        System.out.println("Reverse Function :");
        funRev(5);
        System.out.println("Print Both :");
        funBoth(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        fun(n-1);

    }

    static void funRev(int n){
        if(n == 0){
            return;
        }

        funRev(n-1);
        System.out.println(n);

    }

    static void funBoth(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);

    }
}

/*
Important Points
1) Debug all the problems
2) Understand what you have to return
3) Understand base condition


 */